package com.example.tomasz.mw2classgenerator.Loadouts;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.DeathStreak;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.Equipment;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.PrimaryWeapon;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.SecondaryWeapon;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.SpecialGrenade;

public class Loadout {

    private WeaponStore ws;

    private PrimaryWeapon primaryWeapon;
    private SecondaryWeapon secondaryWeapon;
    private Equipment equipment;
    private SpecialGrenade specialGrenade;
    private DeathStreak deathStreak;
    private PerkLoadout perkLoadout;
    private KillstreakLoadout killstreakLoadout;

    public Loadout(WeaponStore ws) {
        this.ws = ws;

    }

    public void randomise() {
        perkLoadout = ws.getPerkLoadout(); //weapon choices dependent upon perk selection
        killstreakLoadout = ws.getKillstreamLoadout();
        deathStreak = ws.getDeathStreak();
        primaryWeapon = ws.getPrimaryWeapon();
        secondaryWeapon = ws.getSecondaryWeapon();
        equipment = ws.getEquipment();
        specialGrenade = ws.getSpecialGrenade();
    }

    public int getImageResource(LoadoutItem item) {
        return item.getImageResource();
    }

}
