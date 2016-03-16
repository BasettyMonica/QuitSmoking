package com.jntu.monica.quitsmoking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class Splash extends AppCompatActivity {

    ProgressBar splashBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashBar = (ProgressBar) findViewById(R.id.SplashProgress);
        splashBar.setVisibility(View.GONE);
    }
}