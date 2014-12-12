package com.example.tomasz.mw2classgenerator.Loadouts;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.DeathStreak;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.Equipment;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.KillstreakLoadout;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.LoadoutElement;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.PerkLoadout;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.PrimaryWeapon;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.SecondaryWeapon;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.SpecialGrenade;

public class Loadout {

    private WeaponStore ws;
    private int level;

    private PrimaryWeapon primaryWeapon;
    private SecondaryWeapon secondaryWeapon;
    private Equipment equipment;
    private SpecialGrenade specialGrenade;
    private DeathStreak deathStreak;
    private PerkLoadout perkLoadout;
    private KillstreakLoadout killstreakLoadout;

    public Loadout(WeaponStore ws) {
        this.ws = ws;

        randomise();
    }

    public void randomise() {
        perkLoadout = ws.getPerkLoadout(); //weapon choices dependent upon perk selection
        killstreakLoadout = ws.getKillstreakLoadout();
        deathStreak = ws.getDeathStreak();
        primaryWeapon = ws.getPrimaryWeapon();
        secondaryWeapon = ws.getSecondaryWeapon();
        equipment = ws.getEquipment();
        specialGrenade = ws.getSpecialGrenade();
    }

    public PrimaryWeapon getPrimaryWeapon() {
        return primaryWeapon;
    }

    public SecondaryWeapon getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public SpecialGrenade getSpecialGrenade() {
        return specialGrenade;
    }

    public DeathStreak getDeathStreak() {
        return deathStreak;
    }

    public PerkLoadout getPerkLoadout() {
        return perkLoadout;
    }

    public KillstreakLoadout getKillstreakLoadout() {
        return killstreakLoadout;
    }

    public int getImageResource(LoadoutElement item) {
        return item.getImageResource();
    }

}
