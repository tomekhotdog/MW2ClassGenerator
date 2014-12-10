package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutItem;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.PrimaryWeaponType;

public class PrimaryWeapon implements LoadoutItem {
    String name;
    PrimaryWeaponType type;
    int imageResource;

    public PrimaryWeapon(String name, PrimaryWeaponType type, int resourceLocation) {
        this.name = name;
        this.type = type;
        this.imageResource = resourceLocation;
    }

    public int getImageResource() {
        return imageResource;
    }
}
