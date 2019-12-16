package com.example.miwok;

import android.widget.ImageView;

public class Word {
    private String Engtrans;
    private String Miwoktrans;
    private int imageId = NOIMAGEPROVIDED;
    private static final int NOIMAGEPROVIDED = -1;
    public Word(String engtrans,String Miwoktrans,int imageId){
        this.Engtrans = engtrans;
        this.Miwoktrans = Miwoktrans;
        this.imageId = imageId;
    }
    public Word(String engtrans,String Miwoktrans){
        this.Engtrans = engtrans;
        this.Miwoktrans = Miwoktrans;
    }
    public String getDefaultTranslation(){
        return  Engtrans;
    }
    public  String getMiwokTranslation(){
        return Miwoktrans;
    }
    public int getImageResourceId() {
        return imageId;
    }
    public boolean hasImage(){
        return imageId != NOIMAGEPROVIDED;
    }
}
