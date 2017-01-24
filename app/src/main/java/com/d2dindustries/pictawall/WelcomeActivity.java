package com.d2dindustries.pictawall;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.d2dindustries.pictawall.adapters.WelcomeAdapter;
import com.d2dindustries.pictawall.animations.WelcomeSlideTransformer;

/**
 * Handles the Welcome Slide Screen.
 * Created by l1ttl_000 on 1/21/2017.
 */
public class WelcomeActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    WelcomeAdapter wAdapter;
    Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        viewPager = (ViewPager)findViewById(R.id.welcome_view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tabDots);
        wAdapter = new WelcomeAdapter(this);

        tabLayout.setupWithViewPager(viewPager, true);
        viewPager.setAdapter(wAdapter);
        viewPager.setPageTransformer(true, new WelcomeSlideTransformer(R.id.backImageView));
        mStartButton = (Button) findViewById(R.id.getStartedButton);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
