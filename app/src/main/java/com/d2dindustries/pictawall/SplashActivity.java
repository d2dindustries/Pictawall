package com.d2dindustries.pictawall;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * This class handles the Splash Screen
 * Created by l1ttl_000 on 1/21/2017.
 */
public class SplashActivity extends AppCompatActivity {
    SharedPreferences prefs = null;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefs = getSharedPreferences("com.d2dindustries.Pictawall", MODE_PRIVATE);
        intent = new Intent(this, WelcomeActivity.class);

        if (prefs.getBoolean("showWelcome", false)) {
            //Shows Gallery if the user has connected to photos already
            intent = new Intent(this, MainActivity.class);
            //prefs.edit().putBoolean("showWelcome", false).apply();
        }
        startActivity(intent);
        finish();
    }
}
