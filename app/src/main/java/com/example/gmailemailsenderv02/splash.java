package com.example.gmailemailsenderv02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.window.SplashScreen;

public class splash<Splash> extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progress;
    private Object SplashScreen;
    private Object splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        progressBar = (ProgressBar) findViewById(R.id.progressBarId);
        Thread thread = new Thread((new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();

            }


        }));
        thread.start();

    }

    public void doWork() {
        for (progress = 1; progress <= 100; progress = progress + 1) {
            try {
                Thread.sleep(25);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void startApp(){
        Intent intent;
        intent = new Intent(splash.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}