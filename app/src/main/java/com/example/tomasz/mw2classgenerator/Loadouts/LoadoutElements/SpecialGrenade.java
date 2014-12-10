package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutItem;

public class SpecialGrenade implements LoadoutItem {
    String name;
    int imageResource;

    public SpecialGrenade(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public int getImageResource() {
        return imageResource;
    }
}
