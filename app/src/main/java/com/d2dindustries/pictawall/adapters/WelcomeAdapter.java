package com.d2dindustries.pictawall.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.d2dindustries.pictawall.R;

/**
 * Manages populating the Welcome Screen.
 * Created by l1ttl_000 on 1/21/2017.
 */
public class WelcomeAdapter extends PagerAdapter {
    private int[] backgrounds = {R.drawable.welcome_1,R.drawable.welcome_2,R.drawable.welcome_3,R.drawable.welcome_4};
    private int[] icons = {R.drawable.welcome_icon_1,R.drawable.welcome_icon_2,R.drawable.welcome_icon_3,R.drawable.welcome_icon_4};
    private String[] slideStrings = {"Connect To Multiple Photo Sources","View Beautiful Images","Rapid Source Connection","Enjoy Your Photo Grid"};

    private Context ctx;

    public WelcomeAdapter(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return icons.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view ==(RelativeLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.welcome_slide,container,false);

        ImageView welcomeBackImage = (ImageView) v.findViewById(R.id.backImageView);
        TextView welcomeText  = (TextView)v.findViewById(R.id.mainTextView);
        ImageView welcomeIcon = (ImageView) v.findViewById(R.id.iconImageView);
        Context context = welcomeBackImage.getContext().getApplicationContext();

        Glide.with(context).load(backgrounds[position]).animate(R.anim.fade_in).into(welcomeBackImage);
        welcomeText.setText(slideStrings[position]);
        Glide.with(context).load(icons[position]).into(welcomeIcon);

        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        container.refreshDrawableState();
    }
}