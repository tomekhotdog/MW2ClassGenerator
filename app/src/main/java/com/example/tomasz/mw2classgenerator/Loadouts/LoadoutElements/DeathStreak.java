package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutItem;

public class DeathStreak implements LoadoutItem {
    private String name;
    private int imageResource;
    private int levelUnlocked;

    public DeathStreak(String name, int imageResource, int levelUnlocked) {
        this.name = name;
        this.imageResource = imageResource;
        this.levelUnlocked = levelUnlocked;
    }

    public int getImageResource() {
        return imageResource;
    }
}
