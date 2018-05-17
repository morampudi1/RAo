package com.example.welcome.rao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class CircularActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular);
                PrefManager prefManager = new PrefManager(getApplicationContext());

                // make first time launch TRUE
                prefManager.setFirstTimeLaunch(true);

                startActivity(new Intent(CircularActivity.this, WelcomeActivity.class));
                finish();

    }
}