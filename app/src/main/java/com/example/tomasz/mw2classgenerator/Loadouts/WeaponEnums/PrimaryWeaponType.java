package com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums;

import com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements.PrimaryWeapon;

import java.util.ArrayList;
import java.util.Random;

public enum PrimaryWeaponType {
    ASSAULT, SMG, LMG, SNIPER, RIOT;

    public ArrayList<WeaponAttachments> getAttachments(PrimaryWeaponType type) {
        ArrayList<WeaponAttachments> ats = new ArrayList<WeaponAttachments>();
        switch (type) {
            case ASSAULT:
                ats.add(WeaponAttachments.ACOG);
                ats.add(WeaponAttachments.EXTENDEDMAGS);
                ats.add(WeaponAttachments.FMJ);
                ats.add(WeaponAttachments.GRENADELAUNCHER);
                ats.add(WeaponAttachments.HEARTBEAT);
                ats.add(WeaponAttachments.HOLOGRAPHIC);
                ats.add(WeaponAttachments.REDDOT);
                ats.add(WeaponAttachments.SHOTGUN);
                ats.add(WeaponAttachments.SILENCER);
                ats.add(WeaponAttachments.THERMAL);
                break;

            case SMG:
                ats.add(WeaponAttachments.ACOG);
                ats.add(WeaponAttachments.AKIMBO);
                ats.add(WeaponAttachments.EXTENDEDMAGS);
                ats.add(WeaponAttachments.FMJ);
                ats.add(WeaponAttachments.HOLOGRAPHIC);
                ats.add(WeaponAttachments.RAPIDFIRE);
                ats.add(WeaponAttachments.REDDOT);
                ats.add(WeaponAttachments.SHOTGUN);
                ats.add(WeaponAttachments.THERMAL);
                break;

            case LMG:
                ats.add(WeaponAttachments.ACOG);
                ats.add(WeaponAttachments.EXTENDEDMAGS);
                ats.add(WeaponAttachments.FMJ);
                ats.add(WeaponAttachments.GRIP);
                ats.add(WeaponAttachments.HEARTBEAT);
                ats.add(WeaponAttachments.HOLOGRAPHIC);
                ats.add(WeaponAttachments.REDDOT);
                ats.add(WeaponAttachments.SILENCER);
                ats.add(WeaponAttachments.THERMAL);
                break;

            case SNIPER:
                ats.add(WeaponAttachments.ACOG);
                ats.add(WeaponAttachments.EXTENDEDMAGS);
                ats.add(WeaponAttachments.FMJ);
                ats.add(WeaponAttachments.HEARTBEAT);
                ats.add(WeaponAttachments.SILENCER);
                ats.add(WeaponAttachments.THERMAL);
                break;

            default:
        }
        return ats;
    }

    public WeaponAttachments getWeaponAttachment1(PrimaryWeapon p) {
        ArrayList<WeaponAttachments> was = getAttachments(p.getType());
        int size = was.size();
        Random r = new Random();
        int selection = r.nextInt(size);
        return was.get(selection);
    }

    public WeaponAttachments getWeaponAttachment2(PrimaryWeapon p, WeaponAttachments wa1) {
        //TODO: implement bling perk combination rules...
        return null;
    }
}
