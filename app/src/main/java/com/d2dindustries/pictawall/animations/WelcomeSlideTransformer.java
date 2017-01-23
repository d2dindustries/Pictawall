package com.d2dindustries.pictawall.animations;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by l1ttl_000 on 1/21/2017.
 */

public class WelcomeSlideTransformer implements ViewPager.PageTransformer {
    private final int backgroundParallax;

    public WelcomeSlideTransformer(final int backParallaxVal) {
        this.backgroundParallax = backParallaxVal;
    }

    @Override
    public void transformPage(View view, float position) {
        int pageWidth = view.getWidth();

        if (position < -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
            view.setAlpha(1);
        } else if (position <= 1) { // [-1,1]
            view.findViewById(backgroundParallax).setTranslationX(-position * (pageWidth / 2)); //Half the normal speed
        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            view.setAlpha(1);
        }
    }
}