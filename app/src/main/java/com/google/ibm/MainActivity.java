package com.google.ibm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



public class MainActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {

        mMap = googleMap;

        // for loop를 통한 n개의 마커 생성
            // 1. 마커 옵션 설정 (만드는 과정)
            MarkerOptions makerOptions = new MarkerOptions();
            makerOptions // LatLng에 대한 어레이를 만들어서 이용할 수도 있다.
                    .position(new LatLng(35.18, 129.07))
                    .title("마커"); // 타이틀.

            // 2. 마커 생성 (마커를 나타냄)
            mMap.addMarker(makerOptions);
        makerOptions // LatLng에 대한 어레이를 만들어서 이용할 수도 있다.
                .position(new LatLng(37.45, 126.7))
                .title("마커"); // 타이틀.

        // 2. 마커 생성 (마커를 나타냄)
        mMap.addMarker(makerOptions);
        makerOptions // LatLng에 대한 어레이를 만들어서 이용할 수도 있다.
                .position(new LatLng(35.18, 129.07))
                .title("마커"); // 타이틀.

        // 2. 마커 생성 (마커를 나타냄)
        mMap.addMarker(makerOptions);
        makerOptions // LatLng에 대한 어레이를 만들어서 이용할 수도 있다.
                .position(new LatLng(37.67, 128.7))
                .title("마커"); // 타이틀.

        // 2. 마커 생성 (마커를 나타냄)
        mMap.addMarker(makerOptions);
        makerOptions // LatLng에 대한 어레이를 만들어서 이용할 수도 있다.
                .position(new LatLng(36.82,127.1))
                .title("마커"); // 타이틀.

        // 2. 마커 생성 (마커를 나타냄)
        mMap.addMarker(makerOptions);
        makerOptions // LatLng에 대한 어레이를 만들어서 이용할 수도 있다.
                .position(new LatLng(35.83, 129.17))
                .title("마커"); // 타이틀.

        // 2. 마커 생성 (마커를 나타냄)
        mMap.addMarker(makerOptions);
        makerOptions // LatLng에 대한 어레이를 만들어서 이용할 수도 있다.
                .position(new LatLng(36.01, 129.34))
                .title("마커"); // 타이틀.

        // 2. 마커 생성 (마커를 나타냄)
        mMap.addMarker(makerOptions);
        makerOptions // LatLng에 대한 어레이를 만들어서 이용할 수도 있다.
                .position(new LatLng(35.22, 128.68))
                .title("마커"); // 타이틀.

        // 2. 마커 생성 (마커를 나타냄)
        mMap.addMarker(makerOptions);



        // 카메라를 위치로 옮긴다.
        mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(35.18, 129.07)));

}}