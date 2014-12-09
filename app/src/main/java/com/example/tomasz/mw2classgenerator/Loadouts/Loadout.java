package com.example.tomasz.mw2classgenerator.Loadouts;

public class Loadout {

    private PrimaryWeapon primaryWeapon;
    private SecondaryWeapon secondaryWeapon;
    private Equipment equipment;
    private SpecialGrenade specialGrenade;
    private DeathStreak deathStreak;
    private PerkLoadout perkLoadout;
    private KillstreakLoadout killstreakLoadout;

    public Loadout() {
        primaryWeapon = new PrimaryWeapon();
        secondaryWeapon = new SecondaryWeapon();
        equipment = new Equipment();
        specialGrenade = new SpecialGrenade();
        deathStreak = new DeathStreak();
        perkLoadout = new PerkLoadout();
        killstreakLoadout = new KillstreamLoadout();
    }

    public void randomise() {
        perkLoadout.randomise(); //weapon choices dependent upon perk selection
        killstreakLoadout.randomise();
        deathStreak.randomise();

        primaryWeapon.randomise();
        secondaryWeapon.randomise();
        equipment.randomise();
        specialGrenade.randomise();
    }

    public int getImageResource(LoadoutItem item) {
        return item.getImageResource();
    }

}
