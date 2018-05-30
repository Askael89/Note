package com.example.roger.note;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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


    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public void setmTextTitle(String mTextTitle) {
        this.mTextTitle = mTextTitle;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

}
