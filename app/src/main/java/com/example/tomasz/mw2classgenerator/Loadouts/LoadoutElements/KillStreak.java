package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutItemInterface;

public class KillStreak extends LoadoutElement implements LoadoutItemInterface {
    String name;
    int imageResource;
    int killRequired;

    public KillStreak(String name, int imageResource, int killRequired) {
        this.name = name;
        this.imageResource = imageResource;
        this.killRequired = killRequired;
    }

    @Override
    public int getImageResource() {
        return imageResource;
    }

    public int getKillsRequired() {
        return killRequired;
    }

    @Override
    public int getLevelUnlocked() {
        //dummy, no specific level unlock;
        return 0;
    }

    public String getName() {
        return name;
    }
}
