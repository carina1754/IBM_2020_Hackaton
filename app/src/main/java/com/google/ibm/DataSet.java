package com.google.ibm;
import java.sql.*;
import java.util.Random;

class DataSet {
    private static float[][] num = new float[11][97];

    static public float[][] getSum() {
        return num;
    }
    static public void setSum(float[][] a) {
        num = a;
    }
    public static void Data(){

        try {
            int i = 0;
            int j = 0;
            int k = 0;
            float Sun[][][] = new float[4][11][97];
            float Loc[][] = new float[97][2];
            float[][] Sum = new float[11][97];
            int date = 2009;
            String table;
            Data_loc[][] sloc = new Data_loc[97][2];

            String url = "jdbc:mysql://localhost:3306/ibm2020?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "asd3356");
            System.out.println("연결 성공!");
            String qu = "select * from spring";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(qu);

            while (rs.next()) {
                Sun[0][0][j] = rs.getFloat("2009");
                j++;
                if(j>96) {
                    break;
                }
            }
            qu = "select * from spring";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[0][1][j] = rs.getFloat("2010");
                j++;
            }
            qu = "select * from spring";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[0][2][j] = rs.getFloat("2011");
                j++;
            }
            qu = "select * from spring";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[0][3][j] = rs.getFloat("2012");
                j++;
            }
            qu = "select * from spring";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[0][4][j] = rs.getFloat("2013");
                j++;
            }
            qu = "select * from spring";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[0][5][j] = rs.getFloat("2014");
                j++;
            }
            qu = "select * from spring";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[0][6][j] = rs.getFloat("2015");
                j++;
            }
            qu = "select * from spring";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[0][7][j] = rs.getFloat("2016");
                j++;
            }
            qu = "select * from spring";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[0][8][j] = rs.getFloat("2017");
                j++;
            }
            qu = "select * from spring";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[0][9][j] = rs.getFloat("2018");
                j++;
            }
            qu = "select * from spring";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[0][10][j] = rs.getFloat("2019");
                j++;
            }
            st.close();
            //-----------------------------------------------------------------------------------
            qu = "select * from summer";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[1][0][j] = rs.getFloat("2009");
                j++;
            }
            qu = "select * from summer";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[1][1][j] = rs.getFloat("2010");
                j++;
            }
            qu = "select * from summer";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[1][2][j] = rs.getFloat("2011");
                j++;
            }
            qu = "select * from summer";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[1][3][j] = rs.getFloat("2012");
                j++;
            }
            qu = "select * from summer";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[1][4][j] = rs.getFloat("2013");
                j++;
            }
            qu = "select * from summer";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[1][5][j] = rs.getFloat("2014");
                j++;
            }
            qu = "select * from summer";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[1][6][j] = rs.getFloat("2015");
                j++;
            }
            qu = "select * from summer";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[1][7][j] = rs.getFloat("2016");
                j++;
            }
            qu = "select * from summer";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[1][8][j] = rs.getFloat("2017");
                j++;
            }
            qu = "select * from summer";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[1][9][j] = rs.getFloat("2018");
                j++;
            }
            qu = "select * from summer";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[1][10][j] = rs.getFloat("2019");
                j++;
            }
            st.close();
            //-----------------------------------------------------------------------------------
            qu = "select * from fall";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[2][0][j] = rs.getFloat("2009");
                j++;
            }
            qu = "select * from fall";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[2][1][j] = rs.getFloat("2010");
                j++;
            }
            qu = "select * from fall";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[2][2][j] = rs.getFloat("2011");
                j++;
            }
            qu = "select * from fall";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[2][3][j] = rs.getFloat("2012");
                j++;
            }
            qu = "select * from fall";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[2][4][j] = rs.getFloat("2013");
                j++;
            }
            qu = "select * from fall";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[2][5][j] = rs.getFloat("2014");
                j++;
            }
            qu = "select * from fall";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[2][6][j] = rs.getFloat("2015");
                j++;
            }
            qu = "select * from fall";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[2][7][j] = rs.getFloat("2016");
                j++;
            }
            qu = "select * from fall";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[2][8][j] = rs.getFloat("2017");
                j++;
            }
            qu = "select * from fall";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[2][9][j] = rs.getFloat("2018");
                j++;
            }
            qu = "select * from fall";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[2][10][j] = rs.getFloat("2019");
                j++;
            }
            st.close();
            //-----------------------------------------------------------------
            qu = "select * from winter";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[3][0][j] = rs.getFloat("2009");
                j++;
            }
            qu = "select * from winter";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[3][1][j] = rs.getFloat("2010");
                j++;
            }
            qu = "select * from winter";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[3][2][j] = rs.getFloat("2011");
                j++;
            }
            qu = "select * from winter";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[3][3][j] = rs.getFloat("2012");
                j++;
            }
            qu = "select * from winter";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[3][4][j] = rs.getFloat("2013");
                j++;
            }
            qu = "select * from winter";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[3][5][j] = rs.getFloat("2014");
                j++;
            }
            qu = "select * from winter";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[3][6][j] = rs.getFloat("2015");
                j++;
            }
            qu = "select * from winter";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[3][7][j] = rs.getFloat("2016");
                j++;
            }
            qu = "select * from winter";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[3][8][j] = rs.getFloat("2017");
                j++;
            }
            qu = "select * from winter";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[3][9][j] = rs.getFloat("2018");
                j++;
            }
            qu = "select * from winter";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Sun[3][10][j] = rs.getFloat("2019");
                j++;
            }
            st.close();

            qu = "select * from locate";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Loc[j][0] = rs.getFloat("latitude");
                j++;
            }
            qu = "select * from locate";
            st = con.createStatement();
            rs = st.executeQuery(qu);
            j=0;
            while (rs.next()) {
                Loc[j][1] = rs.getFloat("longitude");
                j++;
            }
            st.close();
            for(j=0;j<4;j++) {
                for(k=0;k<11;k++) {
                    for (i = 0; i < 97; i++) {
                        System.out.println(Sun[j][k][i]);
                        System.out.println (i);
                    }
                }
            }
            for(j=0;j<11;j++) {
                for(i=0;i<97;i++) {
                    for(int p=0;p<4;p++) {
                        Sum[j][i] += Sun[p][j][i];
                    }
                }
            }

            /*for(j=0;j<11;j++) {
            	for(i=0;i<97;i++) {

            		Sum[j][i] = (float) (Sum[j][i]/4.0);

            	}
            }

          /*  for(k=0;k<97;k++) {
            for (i = 0; i <2; i++) {
                System.out.println(Loc[k][i]);
            	}
            }
            for(j=0;j<11;j++) {
            	for(i=0;i<97;i++) {
            		System.out.println(Sum[j][i]);
            	}
            }*/
            setSum(Sum);
        }
        catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 실패");
            e.printStackTrace();
        }
        catch (SQLException e) {
            System.out.println("에러: " + e);
            e.printStackTrace();
        }
    }


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
    static Data_sun[]top_30(Data_sun[] data){
        Data_sun tmp[]=new Data_sun[30];
        for(int i=0;i<tmp.length;i++) {
            tmp[i]=data[i];
        }
        return tmp;
    }

    public static void main(String[] args) {
        Data();
        //0열 : 지역코드, 1열 : 해당 지역 일조량
        Data_sun[] sdata = new Data_sun[97];
        float[][] Sum = new float[11][97];
        float[][] Res = new float[11][30];
        Sum=num;
        int i,j,k;

        //샘플 클래스 배열 초기화
        for(j=0;j<11;j++) {
            for(i=0;i<sdata.length;i++){
                sdata[i] = new Data_sun(i+1,Sum[j][i]);
            }

            sdata = top_30(quickSort(sdata,0,sdata.length-1));   //일조량 내림차순으로 정렬히여 일조량 높은 10개만 추출

            //정렬된 일조량
            for(i=0;i<sdata.length;i++) {
                System.out.println("AreaCode : " + sdata[i].getAreaCode() + " / Sunshine : " + sdata[i].getSunshine());
            }
            k=j+2009;
            System.out.println( k + "년도 결과");
            for(i=0;i<sdata.length;i++) {
                Res[j][i] = sdata[i].getSunshine();
            }
        }
        for(j=0;j<11;j++) {
            for(i=0;i<sdata.length;i++) {
                System.out.println(Res[j][i]);
            }
        }
    }}