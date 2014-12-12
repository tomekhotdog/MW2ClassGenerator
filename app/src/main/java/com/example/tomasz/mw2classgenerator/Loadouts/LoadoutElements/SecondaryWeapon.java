package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutItemInterface;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.SecondaryAdditional;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.SecondaryWeaponType;

public class SecondaryWeapon extends LoadoutElement implements LoadoutItemInterface {
    private String name;
    private SecondaryWeaponType type;
    private SecondaryAdditional additional;
    private int imageResource;
    private int levelUnlocked;

    public SecondaryWeapon(String name, SecondaryWeaponType type, SecondaryAdditional additional,
                           int imageLocation, int levelUnlocked) {
        this.name = name;
        this.type = type;
        this.additional = additional;
        this.imageResource = imageLocation;
        this.levelUnlocked = levelUnlocked;
    }

    public int getImageResource() {
        return imageResource;
    }

    @Override
    public int getLevelUnlocked() {
        return levelUnlocked;
    }

    @Override
    public String getName() {
        return name;
    }
}

