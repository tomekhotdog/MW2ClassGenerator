package com.example.tomasz.mw2classgenerator.Loadouts;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.DeathStreak;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.Equipment;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.KillstreakLoadout;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.LoadoutElement;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.PerkLoadout;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.PrimaryWeapon;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.SecondaryWeapon;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.SpecialGrenade;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.WeaponAttachments;

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
    private WeaponAttachments primaryAttachment1;
    private WeaponAttachments primaryAttachment2;
    private WeaponAttachments secondaryAttachment1;
    private WeaponAttachments secondaryAttachment2;

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

        primaryAttachment1 = ws.getPrimaryAttachment1(primaryWeapon);
        primaryAttachment2 = ws.getPrimaryAttachment2(primaryWeapon, primaryAttachment1, perkLoadout.getPerk(1));
        secondaryAttachment1 = ws.getSecondaryAttachment1(secondaryWeapon);
        secondaryAttachment2 = ws.getSecondaryAttachment2(secondaryWeapon, secondaryAttachment1);
    }

    public PrimaryWeapon getPrimaryWeapon() {
        return primaryWeapon;
    }

    public WeaponAttachments getPrimaryAttachment1() {
        return primaryAttachment1;
    }

    public WeaponAttachments getPrimaryAttachment2() {
        return primaryAttachment2;
    }

    public WeaponAttachments getSecondaryAttachment1() {
        return secondaryAttachment1;
    }

    public WeaponAttachments getSecondaryAttachment2() {
        return secondaryAttachment2;
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
