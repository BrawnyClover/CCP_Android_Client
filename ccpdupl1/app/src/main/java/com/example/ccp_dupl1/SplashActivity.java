package com.example.ccp_dupl1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //로딩화면 시작.
        Loadingstart();
    }
    private void Loadingstart(){
        Handler handler=new Handler();
        handler.postDelayed(new Runnable(){
            public void run(){
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}