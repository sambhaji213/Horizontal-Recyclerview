package com.sk.horizontalrecyclerview;

/*
 * Created by Sambhaji Karad on 20-Dec-17
 * Mobile 9423476192
 * Email sambhaji2134@gmail.com/
*/

import java.io.Serializable;

public class ImageModel implements Serializable{

    private long id;
    private String imageName;
    private int imagePath;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getImagePath() {
        return imagePath;
    }

    public void setImagePath(int imagePath) {
        this.imagePath = imagePath;
    }
}
