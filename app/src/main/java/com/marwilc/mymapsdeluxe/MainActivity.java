package com.marwilc.mymapsdeluxe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToMapHome(View v){
        Intent i = new Intent(this, MapsActivityHome.class);
        startActivity(i);
    }

    public void goToMapWork(View v){
        Intent i = new Intent(this, MapsActivityWork.class);
        startActivity(i);
    }

    public void goToMapCinema(View v){
        Intent i = new Intent(this, MapsActivityCinema.class);
        startActivity(i);
    }

    public void goToMapPark(View v){
        Intent i = new Intent(this, MapsActivityPark.class);
        startActivity(i);
    }
}
