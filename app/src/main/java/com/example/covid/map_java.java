package com.example.covid;

import android.os.Bundle;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import net.daum.mf.map.api.MapView;

public class map_java extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedIntenceStae) {
        super.onCreate(savedIntenceStae);
        setContentView(R.layout.map);

        MapView mapView = new MapView(this);

        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);
    }

}
