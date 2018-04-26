package com.example.roger.note;

public class itemCard {
    private int mImageResource;
    private String mTextTitle;
    private String mDate;

    public itemCard(int imageresource, String title, String date){
        mImageResource = imageresource;
        mTextTitle = title;
        mDate = date;
    }

    public int getmImageResource(){
        return mImageResource;
    }

    public String getmTextTitle(){
        return mTextTitle;
    }

    public String getmDate(){
        return mDate;
    }

}
