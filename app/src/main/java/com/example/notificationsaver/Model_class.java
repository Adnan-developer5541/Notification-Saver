package com.example.notificationsaver;

import android.graphics.Bitmap;

public class Model_class {
    String name;
    Bitmap imaBitmap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getImage() {
        return imaBitmap;
    }

    public void setImage(Bitmap imaBitmap) {
        this.imaBitmap = imaBitmap;
    }
}
