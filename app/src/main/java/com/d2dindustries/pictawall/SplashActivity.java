package com.d2dindustries.pictawall;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.d2dindustries.pictawall.utils.SharedPreferenceManager;

/**
 * Handles a simple Splash Screen.
 * Created by l1ttl_000 on 1/21/2017.
 */
public class SplashActivity extends AppCompatActivity {
    SharedPreferenceManager sharedPrefs;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPrefs = new SharedPreferenceManager(this);
        intent = new Intent(this, WelcomeActivity.class);

        if (sharedPrefs.getShowWelcomeScreen()) {
            //Shows Gallery if the user has seen welcome screen already
            intent = new Intent(this, MainActivity.class);
            //sharedPrefs.setShowWelcomeScreen(true);
        }
        startActivity(intent);
        finish();
    }
}
