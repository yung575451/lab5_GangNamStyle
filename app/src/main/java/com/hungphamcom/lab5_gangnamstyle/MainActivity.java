package com.hungphamcom.lab5_gangnamstyle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GraphicsView graphicsView=new GraphicsView(MainActivity.this);
        setContentView(graphicsView);
    }
}