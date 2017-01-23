package com.d2dindustries.pictawall;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import com.d2dindustries.pictawall.fragments.GalleryGridFragment;
import com.d2dindustries.pictawall.utils.SharedPhotoSourceStrings;
import com.d2dindustries.pictawall.utils.SharedPreferenceManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, GalleryGridFragment.getInstance()).commit();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //Loads saved choice of photo data source
        SharedPreferenceManager s = new SharedPreferenceManager(this);
        String loadTitle = s.getToolbarNetwork();
//        int loadColor = s.getToolbarColor();
//        int socialId = s.getChosenSourceId();
//        SharedPhotoSourceStrings.SOCIAL_GENERIC_SOURCE = socialId;
//        SharedPhotoSourceStrings.SOCIAL_GENERIC_BASE = SOCIAL_ARRAY_BASE[socialId];
//        SharedPhotoSourceStrings.SOCIAL_GENERIC_GET = SOCIAL_ARRAY_GET[socialId];

//        ColorDrawable colorDrawable = new ColorDrawable(loadColor);
//        toolbar.setBackgroundDrawable(colorDrawable);
        toolbar.setTitle(loadTitle);

        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ConnectActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu_main,menu);
        return true;
    }

}
