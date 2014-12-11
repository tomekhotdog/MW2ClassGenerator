package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutItemInterface;

public class Equipment extends LoadoutElement implements LoadoutItemInterface {
    private String name;
    private int imageResource;
    private int levelUnlocked;

    @Override
    public int getLevelUnlocked() {
        return levelUnlocked;
    }

    public Equipment(String name, int imageResource, int levelUnlocked) {
        this.name = name;
        this.imageResource = imageResource;
        this.levelUnlocked = levelUnlocked;
    }

    public int getImageResource() {
        return imageResource;
    }
}
