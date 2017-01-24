package com.d2dindustries.pictawall;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.res.ResourcesCompat;
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
        SharedPreferenceManager sharedPreferences = new SharedPreferenceManager(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //Load correct toolbar colors/title
        int sId = sharedPreferences.getChosenSourceId();
        ColorDrawable colorDrawable = new ColorDrawable(ResourcesCompat.getColor(getResources(), SharedPhotoSourceStrings.SOCIAL_ARRAY_COLOR[sId], null));
        toolbar.setTitle(SharedPhotoSourceStrings.SOCIAL_ARRAY_NETWORK[sId]);
        toolbar.setBackgroundDrawable(colorDrawable);
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
