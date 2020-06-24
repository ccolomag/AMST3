package com.example.amst3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void grafico(View v){
        Intent intent = new Intent(MainActivity.this,GraficoActivity.class);
        startActivity(intent);
    }
    public void video(View v){
        Intent intent = new Intent(MainActivity.this,VideoActivity.class);
        startActivity(intent);
    }
}
