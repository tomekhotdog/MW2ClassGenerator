package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutItem;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.SecondaryAdditional;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.SecondaryWeaponType;

public class SecondaryWeapon implements LoadoutItem {
    private String name;
    private SecondaryWeaponType type;
    private SecondaryAdditional additional;
    private int imageResource;

    public SecondaryWeapon(String name, SecondaryWeaponType type, SecondaryAdditional additional, int imageLocation) {
        this.name = name;
        this.type = type;
        this.additional = additional;
        this.imageResource = imageLocation;
    }

    public int getImageResource() {
        return imageResource;
    }
}

