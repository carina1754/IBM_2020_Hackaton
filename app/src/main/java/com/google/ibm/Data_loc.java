package com.google.ibm;

public class Data_loc {
    private float latitude;
    private float longitude;
    private int area_code;
    private String locate;

    //기본 생성자
    public Data_loc(){
        latitude = 0;
        longitude = 0;
        area_code = -1;
        locate = " ";
    }

    //생성자 : 엑셀파일에서 가져온 값들 불러와서 클래스 생성
    public Data_loc(int _acode,float _lat,float _long, String _loc){
        latitude = _lat;
        longitude = _long;
        area_code = _acode;
        locate = _loc;
    }

    //입력받은 정수와 지역코드가 일치하는지 확인
    int check(int put_code) {
        if (put_code == area_code)
            return 1;
        else return 0;
    }

    //getter, setter함수
    public int getAreaCode(){
        return area_code;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public String getLocate() {
        return locate;
    }

    public void setAreaCode(int _acode){
        area_code = _acode;
    }

    public void setLatitude(float _lat){
        latitude = _lat;
    }

    public void setLongitude(float _long){
        longitude = _long;
    }

    public void setLocate(String _loc){
        locate = _loc;
    }

}
