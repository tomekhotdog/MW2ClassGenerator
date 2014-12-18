package com.example.tomasz.mw2classgenerator.Loadouts.WeaponStores;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.DeathStreak;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.Equipment;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.KillStreak;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.LoadoutElement;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.Perk;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.PrimaryWeapon;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.SecondaryWeapon;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.SpecialGrenade;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.PrimaryWeaponType;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.SecondaryAdditional;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.SecondaryWeaponType;
import com.example.tomasz.mw2classgenerator.R;

import java.util.ArrayList;

public class DefensiveWeaponStore extends WeaponStore {

    public DefensiveWeaponStore(int level) { super(level); }

    @Override
    public void createWeapons() {
        primaryWeapons = new ArrayList<LoadoutElement>();
        primaryWeapons.add(new PrimaryWeapon("M4A1", PrimaryWeaponType.ASSAULT, R.drawable.m4a1, 0));
        primaryWeapons.add(new PrimaryWeapon("FAMAS", PrimaryWeaponType.ASSAULT, R.drawable.famas, 4));
        primaryWeapons.add(new PrimaryWeapon("SCAR-H", PrimaryWeaponType.ASSAULT, R.drawable.scarh, 8));
        primaryWeapons.add(new PrimaryWeapon("TAR-21", PrimaryWeaponType.ASSAULT, R.drawable.tar21, 20));
        primaryWeapons.add(new PrimaryWeapon("FAL", PrimaryWeaponType.ASSAULT , R.drawable.fal, 28));
        primaryWeapons.add(new PrimaryWeapon("M16A4", PrimaryWeaponType.ASSAULT, R.drawable.m16a4, 40));
        primaryWeapons.add(new PrimaryWeapon("ACR", PrimaryWeaponType.ASSAULT, R.drawable.acr, 48));
        primaryWeapons.add(new PrimaryWeapon("F2000", PrimaryWeaponType.ASSAULT, R.drawable.f2000, 60));
        primaryWeapons.add(new PrimaryWeapon("AK-47", PrimaryWeaponType.ASSAULT, R.drawable.ak47, 70));
        primaryWeapons.add(new PrimaryWeapon("L86 LSW", PrimaryWeaponType.LMG, R.drawable.l86lsw, 0));
        primaryWeapons.add(new PrimaryWeapon("RPD", PrimaryWeaponType.LMG, R.drawable.rpd, 0));
        primaryWeapons.add(new PrimaryWeapon("MG4", PrimaryWeaponType.LMG, R.drawable.mg4, 16));
        primaryWeapons.add(new PrimaryWeapon("AUG HBAR", PrimaryWeaponType.LMG, R.drawable.aughbar, 32));
        primaryWeapons.add(new PrimaryWeapon("M240", PrimaryWeaponType.LMG, R.drawable.m240, 52));

        secondaryWeapons = new ArrayList<LoadoutElement>();
        secondaryWeapons.add(new SecondaryWeapon("PP2000", SecondaryWeaponType.MACHINEPISTOL, null, R.drawable.pp2000, 0));
        secondaryWeapons.add(new SecondaryWeapon("G18", SecondaryWeaponType.MACHINEPISTOL, null, R.drawable.g18, 22));
        secondaryWeapons.add(new SecondaryWeapon("M93 Raffica", SecondaryWeaponType.MACHINEPISTOL, null, R.drawable.m93raffica, 38));
        secondaryWeapons.add(new SecondaryWeapon("TMP", SecondaryWeaponType.MACHINEPISTOL, null , R.drawable.tmp, 58));
        secondaryWeapons.add(new SecondaryWeapon("SPAS-12", SecondaryWeaponType.SHOTGUN, SecondaryAdditional.SPAS12 , R.drawable.spas12, 0));
        secondaryWeapons.add(new SecondaryWeapon("AA-12", SecondaryWeaponType.SHOTGUN, SecondaryAdditional.AA12 , R.drawable.aa12, 18));
        secondaryWeapons.add(new SecondaryWeapon("Striker", SecondaryWeaponType.SHOTGUN, SecondaryAdditional.STRIKER , R.drawable.striker, 34));
        secondaryWeapons.add(new SecondaryWeapon("Ranger", SecondaryWeaponType.SHOTGUN, SecondaryAdditional.RANGER , R.drawable.ranger, 42));
        secondaryWeapons.add(new SecondaryWeapon("M1014", SecondaryWeaponType.SHOTGUN, SecondaryAdditional.M1014 , R.drawable.m1014, 54));
        secondaryWeapons.add(new SecondaryWeapon("Model 1887", SecondaryWeaponType.SHOTGUN, SecondaryAdditional.MODEL1887 , R.drawable.model1887, 67));
        secondaryWeapons.add(new SecondaryWeapon("AT4-HS", SecondaryWeaponType.LAUNCHER, null, R.drawable.at4hs, 0));
        secondaryWeapons.add(new SecondaryWeapon("Thumper x2", SecondaryWeaponType.LAUNCHER, null, R.drawable.thumper, 14));
        secondaryWeapons.add(new SecondaryWeapon("Stinger", SecondaryWeaponType.LAUNCHER, null, R.drawable.stinger, 30));
        secondaryWeapons.add(new SecondaryWeapon("Javelin", SecondaryWeaponType.LAUNCHER, null, R.drawable.javelin, 50));
        secondaryWeapons.add(new SecondaryWeapon("RPG-7 x2", SecondaryWeaponType.LAUNCHER, null, R.drawable.rpg7, 65));

        //0 represents default location, may provide image resources in the future
        equipment = new ArrayList<LoadoutElement>();
        equipment.add(new Equipment("Frag", 0, 0));
        equipment.add(new Equipment("Semtex", 0, 0));
        equipment.add(new Equipment("Tactical Insertion", 0, 11));
        equipment.add(new Equipment("Blast Shield", 0, 19));
        equipment.add(new Equipment("Claymore", 0, 31));
        equipment.add(new Equipment("C4", 0, 43));

        specialGrenades = new ArrayList<LoadoutElement>();
        specialGrenades.add(new SpecialGrenade("Flash Grenade", 0, 0));
        specialGrenades.add(new SpecialGrenade("Stun Grenade", 0, 0));
        specialGrenades.add(new SpecialGrenade("Smoke Grenade", 0, 0));

        deathStreaks = new ArrayList<LoadoutElement>();
        deathStreaks.add(new DeathStreak("Copycat", R.drawable.copycat, 0));
        deathStreaks.add(new DeathStreak("Painkiller", R.drawable.painkiller, 6));
        deathStreaks.add(new DeathStreak("Martyrdom", R.drawable.martyrdom, 27));
        deathStreaks.add(new DeathStreak("Final Stand", R.drawable.finalstand, 39));

        perk1s = new ArrayList<LoadoutElement>();
        perk1s.add(new Perk("Scavenger", 1, 13, R.drawable.scavenger));
        perk1s.add(new Perk("Bling", 1, 21, R.drawable.bling));
        perk1s.add(new Perk("One Man Army", 1, 45, R.drawable.onemanarmy));

        perk2s = new ArrayList<LoadoutElement>();
        perk2s.add(new Perk("Stopping Power", 2, 0, R.drawable.stoppingpower));
        perk2s.add(new Perk("Hardline", 2, 9, R.drawable.hardline));
        perk2s.add(new Perk("Cold-Blooded", 2, 25, R.drawable.coldblooded));
        perk2s.add(new Perk("Danger Close", 2, 33, R.drawable.dangerclose));

        perk3s = new ArrayList<LoadoutElement>();
        perk3s.add(new Perk("Steady Aim", 3, 0, R.drawable.steadyaim));
        perk3s.add(new Perk("SitRep", 3, 37, R.drawable.sitrep));
        perk3s.add(new Perk("Last Stand", 3, 41, R.drawable.laststand));

        killStreaks = new ArrayList<LoadoutElement>();
        killStreaks.add(new KillStreak("UAV", R.drawable.uav, 3));
        killStreaks.add(new KillStreak("Care Package", R.drawable.carepackage, 4));
        killStreaks.add(new KillStreak("Counter-UAV", R.drawable.counteruav, 4));
        killStreaks.add(new KillStreak("Sentry Gun", R.drawable.sentrygun, 5));
        killStreaks.add(new KillStreak("Predator Missile", R.drawable.predatormisile, 5));
        killStreaks.add(new KillStreak("Precision Airstrike", R.drawable.precisionairtstrike, 6));
        killStreaks.add(new KillStreak("Harrier Striker", R.drawable.harrierstrike, 7));
        killStreaks.add(new KillStreak("Attack Helicopter", R.drawable.attackhelicopter, 7));
        killStreaks.add(new KillStreak("Emergency Airdrop", R.drawable.emergencyairdrop, 8));
        killStreaks.add(new KillStreak("Pave Low", R.drawable.pavelow, 9));
        killStreaks.add(new KillStreak("Stealth Bomber", R.drawable.stealthbomber, 9));
        killStreaks.add(new KillStreak("Chopper Gunner", R.drawable.choppergunner, 11));
        killStreaks.add(new KillStreak("AC130", R.drawable.ac130, 11));
        killStreaks.add(new KillStreak("EMP", R.drawable.emp, 15));
        killStreaks.add(new KillStreak("Tactical Nuke", R.drawable.tacticalnuke, 25));

    }
}
