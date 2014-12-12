package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutItemInterface;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.PrimaryWeaponType;

public class PrimaryWeapon extends LoadoutElement implements LoadoutItemInterface {
    String name;
    PrimaryWeaponType type;
    int imageResource;
    int levelUnlocked;

    public PrimaryWeapon(String name, PrimaryWeaponType type, int resourceLocation, int levelUnlocked) {
        this.name = name;
        this.type = type;
        this.imageResource = resourceLocation;
        this.levelUnlocked = levelUnlocked;
    }

    @Override
    public int getLevelUnlocked() {
        return levelUnlocked;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public PrimaryWeaponType getType() {
        return type;
    }
}
