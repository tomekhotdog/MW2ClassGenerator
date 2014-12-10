package com.example.tomasz.mw2classgenerator.Loadouts;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.DeathStreak;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.Equipment;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.KillStreak;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.Perk;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.PrimaryWeapon;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.SecondaryWeapon;
import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.SpecialGrenade;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.PrimaryWeaponType;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.SecondaryAdditional;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums.SecondaryWeaponType;
import com.example.tomasz.mw2classgenerator.R;

import java.util.ArrayList;

public class WeaponStore {

    ArrayList<PrimaryWeapon> primaryWeapons;
    ArrayList<SecondaryWeapon> secondaryWeapons;
    ArrayList<Equipment> equipment;
    ArrayList<SpecialGrenade> specialGrenades;
    ArrayList<DeathStreak> deathStreaks;
    ArrayList<Perk> perk1s;
    ArrayList<Perk> perk2s;
    ArrayList<Perk> perk3s;
    ArrayList<KillStreak> killStreaks;

    public WeaponStore() {
        createWeapons();
    }

    private void createWeapons() {
        primaryWeapons = new ArrayList<PrimaryWeapon>();
        primaryWeapons.add(new PrimaryWeapon("M4A1", PrimaryWeaponType.ASSAULT, R.drawable.m4a1));
        primaryWeapons.add(new PrimaryWeapon("FAMAS", PrimaryWeaponType.ASSAULT, R.drawable.famas));
        primaryWeapons.add(new PrimaryWeapon("SCAR-H", PrimaryWeaponType.ASSAULT, R.drawable.scarh));
        primaryWeapons.add(new PrimaryWeapon("TAR-21", PrimaryWeaponType.ASSAULT, R.drawable.tar21));
        primaryWeapons.add(new PrimaryWeapon("FAL", PrimaryWeaponType.ASSAULT , R.drawable.fal));
        primaryWeapons.add(new PrimaryWeapon("M16A4", PrimaryWeaponType.ASSAULT, R.drawable.m16a4));
        primaryWeapons.add(new PrimaryWeapon("ACR", PrimaryWeaponType.ASSAULT, R.drawable.acr));
        primaryWeapons.add(new PrimaryWeapon("F2000", PrimaryWeaponType.ASSAULT, R.drawable.f2000));
        primaryWeapons.add(new PrimaryWeapon("AK-47", PrimaryWeaponType.ASSAULT, R.drawable.ak47));
        primaryWeapons.add(new PrimaryWeapon("MP5K", PrimaryWeaponType.SMG, R.drawable.mp5k));
        primaryWeapons.add(new PrimaryWeapon("UMP45", PrimaryWeaponType.SMG, R.drawable.ump45));
        primaryWeapons.add(new PrimaryWeapon("Vector", PrimaryWeaponType.SMG, R.drawable.vector));
        primaryWeapons.add(new PrimaryWeapon("P90", PrimaryWeaponType.SMG, R.drawable.p90));
        primaryWeapons.add(new PrimaryWeapon("Mini-Uzi", PrimaryWeaponType.SMG, R.drawable.miniuzi));
        primaryWeapons.add(new PrimaryWeapon("L86 LSW", PrimaryWeaponType.LMG, R.drawable.l86lsw));
        primaryWeapons.add(new PrimaryWeapon("RPD", PrimaryWeaponType.LMG, R.drawable.rpd));
        primaryWeapons.add(new PrimaryWeapon("MG4", PrimaryWeaponType.LMG, R.drawable.mg4));
        primaryWeapons.add(new PrimaryWeapon("AUG HBAR", PrimaryWeaponType.LMG, R.drawable.aughbar));
        primaryWeapons.add(new PrimaryWeapon("M240", PrimaryWeaponType.LMG, R.drawable.m240));

        secondaryWeapons = new ArrayList<SecondaryWeapon>();
        secondaryWeapons.add(new SecondaryWeapon("PP2000", SecondaryWeaponType.MACHINEPISTOL, null, R.drawable.pp2000));
        secondaryWeapons.add(new SecondaryWeapon("G18", SecondaryWeaponType.MACHINEPISTOL, null, R.drawable.g18));
        secondaryWeapons.add(new SecondaryWeapon("M93 Raffica", SecondaryWeaponType.MACHINEPISTOL, null, R.drawable.m93raffica));
        secondaryWeapons.add(new SecondaryWeapon("TMP", SecondaryWeaponType.MACHINEPISTOL, null , R.drawable.tmp));
        secondaryWeapons.add(new SecondaryWeapon("SPAS-12", SecondaryWeaponType.SHOTGUN, SecondaryAdditional.SPAS12 , R.drawable.spas12));
        secondaryWeapons.add(new SecondaryWeapon("AA-12", SecondaryWeaponType.SHOTGUN, SecondaryAdditional.AA12 , R.drawable.aa12));
        secondaryWeapons.add(new SecondaryWeapon("Striker", SecondaryWeaponType.SHOTGUN, SecondaryAdditional.STRIKER , R.drawable.striker));
        secondaryWeapons.add(new SecondaryWeapon("Ranger", SecondaryWeaponType.SHOTGUN, SecondaryAdditional.RANGER , R.drawable.ranger));
        secondaryWeapons.add(new SecondaryWeapon("M1014", SecondaryWeaponType.SHOTGUN, SecondaryAdditional.M1014 , R.drawable.m1014));
        secondaryWeapons.add(new SecondaryWeapon("Model 1887", SecondaryWeaponType.SHOTGUN, SecondaryAdditional.MODEL1887 , R.drawable.model1887));
        secondaryWeapons.add(new SecondaryWeapon("USP .45", SecondaryWeaponType.HANDGUN, SecondaryAdditional.USP , R.drawable.usp_45));
        secondaryWeapons.add(new SecondaryWeapon(".44 Magnum", SecondaryWeaponType.HANDGUN, SecondaryAdditional.MAGNUM, R.drawable.magnum));
        secondaryWeapons.add(new SecondaryWeapon("M9", SecondaryWeaponType.HANDGUN, SecondaryAdditional.M9, R.drawable.m9));
        secondaryWeapons.add(new SecondaryWeapon("Desert Eagle", SecondaryWeaponType.HANDGUN, SecondaryAdditional.DESERTEAGLE, R.drawable.deserteagle));
        secondaryWeapons.add(new SecondaryWeapon("AT4-HS", SecondaryWeaponType.LAUNCHER, null, R.drawable.at4hs));
        secondaryWeapons.add(new SecondaryWeapon("Thumper x2", SecondaryWeaponType.LAUNCHER, null, R.drawable.thumper));
        secondaryWeapons.add(new SecondaryWeapon("Stinger", SecondaryWeaponType.LAUNCHER, null, R.drawable.stinger));
        secondaryWeapons.add(new SecondaryWeapon("Javelin", SecondaryWeaponType.LAUNCHER, null, R.drawable.javelin));
        secondaryWeapons.add(new SecondaryWeapon("RPG-7 x2", SecondaryWeaponType.LAUNCHER, null, R.drawable.rpg7));

        equipment = new ArrayList<Equipment>();
        equipment.add(new Equipment("Frag", 0));
        equipment.add(new Equipment("Semtex", 0));
        //TODO: etc.
    }
}

