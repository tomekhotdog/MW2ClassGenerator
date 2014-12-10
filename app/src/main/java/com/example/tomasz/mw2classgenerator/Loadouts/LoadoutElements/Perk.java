package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutItem;

public class Perk implements LoadoutItem {
    String name;
    int imageResource;
    int levelUnlocked;
    int category;

    public Perk(String name, int category, int levelUnlocked, int imageResource) {
        this.name = name;
        this.category = category;
        this.levelUnlocked = levelUnlocked;
        this.imageResource = imageResource;
    }

    public int getImageResource() {
        return imageResource;
    }
}
