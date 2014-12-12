package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutItemInterface;

public class SpecialGrenade extends LoadoutElement implements LoadoutItemInterface {
    private String name;
    private int imageResource;

    @Override
    public int getLevelUnlocked() {
        return 0;
    }

    private int levelUnlocked;

    public SpecialGrenade(String name, int imageResource, int levelUnlocked) {
        this.name = name;
        this.imageResource = imageResource;
        this.levelUnlocked = levelUnlocked;
    }

    public int getImageResource() {
        return imageResource;
    }

    @Override
    public String getName() {
        return name;
    }
}
