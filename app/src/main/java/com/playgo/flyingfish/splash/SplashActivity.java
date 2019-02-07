package com.playgo.flyingfish.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.playgo.flyingfish.AppNavigator;
import com.playgo.flyingfish.R;

public class SplashActivity extends AppCompatActivity {

    private static final int SLEEP = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(SLEEP);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    AppNavigator.navigateToMainActivity(SplashActivity.this);
                }
            }
        });

        thread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
