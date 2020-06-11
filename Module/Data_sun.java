public class Data_sun{
    //멤버 변수
    private int area_code;
    private float sunshine;

    //생성자
    public Data_sun(){
        area_code = -1;
        sunshine = 0;
    }
    public Data_sun(int _acode, float _sun){
        area_code = _acode;
        sunshine = _sun;
    }

    //getter, setter함수
    public int getAreaCode(){
        return area_code;
    }
    public float getSunshine(){
        return sunshine;
    }
    public void setAreaCode(int _acode){
        area_code = _acode;
    }
    public void setSunshine(float _sun){
        sunshine = _sun;
    }
}
