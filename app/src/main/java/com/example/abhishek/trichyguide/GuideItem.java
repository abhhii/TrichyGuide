package com.example.abhishek.trichyguide;

public class GuideItem {
    private String mAddress;
    private String mTitle;
    private String mAbout;
    private int mImageResourceId;

    //constructor definition
    public GuideItem(String title, String address, String about,int imageResourceId) {
        mAbout=about;
        mAddress=address;
        mTitle=title;
        mImageResourceId = imageResourceId;
    }

    //getters for attributes
    public String getmAbout() {return mAbout;}

    public String getmAddress() {return mAddress;}

    public String getmTitle() {return mTitle;}

    public int getmImageResourceId() {return mImageResourceId;    }
}