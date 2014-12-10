package com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums;

import java.util.ArrayList;

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
}
