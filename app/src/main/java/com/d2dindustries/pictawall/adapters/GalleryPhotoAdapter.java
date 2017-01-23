package com.d2dindustries.pictawall.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.d2dindustries.pictawall.R;
import com.d2dindustries.pictawall.models.GenericPhotoSource;

/**
 * Created by l1ttl_000 on 1/22/2017.
 */
public class GalleryPhotoAdapter extends ArrayAdapter<GenericPhotoSource>{
    private Context mContext;
    private int mResource;

    public GalleryPhotoAdapter(Context context, int resource) {
        super(context, resource);
        mContext = context;
        mResource = resource;
    }

    private class ViewHolder {
        ImageView imageView;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null){
            holder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(mResource, parent, false);
            holder.imageView = (ImageView) convertView.findViewById(R.id.thumbnail);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        try {
            //Loads the thumbnails into the photo wall
            Glide.with(mContext).load(getItem(position).getThumbnail()).placeholder(R.drawable.thumbnail_placeholder).error(R.drawable.thumbnail_placeholder_error).animate(R.anim.fade_in).into(holder.imageView);
        }catch (NullPointerException n){
            Log.e("NullPointerException","Error loading thumbnail from source.");
        }

        return convertView;
    }
}
