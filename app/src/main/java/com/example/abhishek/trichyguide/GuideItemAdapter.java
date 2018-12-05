package com.example.abhishek.trichyguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.view.LayoutInflater.from;

public class GuideItemAdapter extends ArrayAdapter<GuideItem>{
    public GuideItemAdapter(Activity context, ArrayList<GuideItem> guideItems)
    {
        super(context, 0, guideItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView ==null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        GuideItem currentItem = getItem(position);
        TextView titleText = (TextView)listItemView.findViewById(R.id.title_text_view);
        titleText.setText(currentItem.getmTitle());

        TextView addressText = (TextView)listItemView.findViewById(R.id.address_text_view);
        addressText.setText(currentItem.getmAddress());

        TextView aboutText = (TextView)listItemView.findViewById(R.id.about_text_view);
        aboutText.setText(currentItem.getmAbout());

        ImageView img = (ImageView)listItemView.findViewById(R.id.image);
        img.setImageResource(currentItem.getmImageResourceId());


        return listItemView;
    }
}
