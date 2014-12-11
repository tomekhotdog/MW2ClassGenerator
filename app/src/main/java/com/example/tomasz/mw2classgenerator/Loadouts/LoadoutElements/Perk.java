package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutItemInterface;

public class Perk extends LoadoutElement implements LoadoutItemInterface {
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

    public int getLevelUnlocked() {
        return levelUnlocked;
    }
}
