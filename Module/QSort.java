import java.util.Arrays;

public class QuickSort { 
    static int partition(float[][] array,int start, int end) { 
        float pivot = array[(start+end)/2][1];
        while(start<=end) { 
            while(array[start][1]>pivot) start++;
            while(array[end][1]<pivot) end--;
            if(start<=end) { 
                float tmp[] = array[start];
                array[start]=array[end];
                array[end]=tmp;
                start++; end--;
            } 
        } 
        return start;
    } 
    static float[][] quickSort(float[][] array,int start, int end) { 
        int p = partition(array, start, end);
        if(start<p-1) quickSort(array,start,p-1);
        if(start<end) quickSort(array,p,end);
        return array;
    } 
    static float[][]top_10(float[][] array){ 
       float tmp[][]=new float[10][2];
       for(int i=0;i<tmp.length;i++) { 
           tmp[i]=array[i];
        } 
       return tmp;
    } 
    public static void main(String[] args) { 
       //0열 : 지역코드, 1열 : 해당 지역 일조량
        float[][] array = {{1,4},{2,9},{3,6},{4,7},{5,1},{6,5},{7,7},{8,6},{9,3},{10,2},{11,8}};
        
        array = top_10(quickSort(array,0,array.length-1));   //일조량 내림차순으로 정렬히여 일조량 높은 10개만 추출
        
        //정렬된 일조량
        for(int i=0;i<array.length;i++) { 
        System.out.println(Arrays.toString(array[i]));
        } 
    } 
} 
