package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutItem;

public class Equipment implements LoadoutItem {
    private String name;
    private int imageResource;

    public Equipment(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public int getImageResource() {
        return imageResource;
    }
}
