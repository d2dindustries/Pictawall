package com.d2dindustries.pictawall.utils;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.bumptech.glide.request.target.ViewTarget;
import com.d2dindustries.pictawall.R;

/**
 * Glide setTag Fix courtesy of http://stackoverflow.com/questions/34833627/error-you-must-not-call-settag-on-a-view-glide-is-targeting-when-use-glide
 * Created by l1ttl_000 on 1/22/2017.
 */

public class App extends Application {
    @Override public void onCreate() {
        super.onCreate();
        ViewTarget.setTagId(R.id.glide_tag);
    }
}