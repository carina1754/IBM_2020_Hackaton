import java.util.Random;

public class QSort {
    //Data_sun 배열의 멤버변수 sunshine값 분할
    static int partition(Data_sun[] data,int start, int end) {
        float pivot = data[(start+end)/2].getSunshine();
        while(start<=end) {
            while(data[start].getSunshine()>pivot) start++;
            while(data[end].getSunshine()<pivot) end--;
            if(start<=end) {
                Data_sun tmp = data[start];
                data[start]=data[end];
                data[end]=tmp;
                start++; end--;
            }
        } 
        return start;
    }
    static Data_sun[] quickSort(Data_sun[] data,int start, int end) {
        int p = partition(data, start, end);
        if(start<p-1) quickSort(data,start,p-1);
        if(start<end) quickSort(data,p,end);
        return data;
    }

    //값이 가장 높은 10개 데이터 추출
    static Data_sun[]top_10(Data_sun[] data){
       Data_sun tmp[]=new Data_sun[10];
       for(int i=0;i<tmp.length;i++) {
           tmp[i]=data[i];
        }
       return tmp;
    }
    public static void main(String[] args) {
       //0열 : 지역코드, 1열 : 해당 지역 일조량
        Data_sun[] sdata = new Data_sun[12];

        //샘플 클래스 배열 초기화
        Random rand = new Random();
        for(int i=0;i<sdata.length;i++){
            sdata[i] = new Data_sun(i,Math.round(rand.nextFloat()*100*100/100));
        }
      
        sdata = top_10(quickSort(sdata,0,sdata.length-1));   //일조량 내림차순으로 정렬히여 일조량 높은 10개만 추출
        
        //정렬된 일조량
        for(int i=0;i<sdata.length;i++) {
        System.out.println("AreaCode : " + sdata[i].getAreaCode() + " / Sunshine : " + sdata[i].getSunshine());
        }
    } 
}
