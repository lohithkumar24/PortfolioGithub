package com.example.android.ksappportfolios;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Method to show toast on Popular Movies button click
    public void showToastPopularMovies(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my " + "Popular Movies " + "App", Toast.LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
    }

    //Method to show toast on Stock Hawk button click
    public void showToastStockHawk(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my " + "Stock Hawk " + "App", Toast.LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
    }

    //Method to show toast on Build It Bigger button click
    public void showToastBuildItBigger(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my " + "Build it Bigger " + "App", Toast.LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
    }

    //Method to show toast on Make Your App Material button click
    public void showToastMakeYourAppMaterial(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my " + "Make Your App Material " + "App", Toast.LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
    }

    //Method to show toast on Go Ubiquitous button click
    public void showToastGoUbiquitous(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my " + "Go Ubiquitous " + "App", Toast.LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
    }

    //Method to show toast on Capstone button click
    public void showToastCapstone(View view) {
        Toast toast = Toast.makeText(this, "This button will launch my " + "Capstone " + "App", Toast.LENGTH_SHORT);
        toast.show();
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
    }
}
