package com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums;

import com.example.tomasz.mw2classgenerator.R;

/**
 * Created by Tomasz on 09/12/14.
 */
public enum WeaponAttachments {
    ACOG, AKIMBO, EXTENDEDMAGS, FMJ, GRENADELAUNCHER, GRIP, HEARTBEAT,
    HOLOGRAPHIC, RAPIDFIRE, REDDOT, SHOTGUN, SILENCER, TACTICALKNIFE, THERMAL;

    @Override
    public String toString() {
        switch(this) {
            case ACOG:
                return "ACOG";
            case AKIMBO:
                return "Akimbo";
            case EXTENDEDMAGS:
                return "Extended Mags";
            case FMJ:
                return "FMJ";
            case GRENADELAUNCHER:
                return "Grenade Launcher";
            case GRIP:
                return "Grip";
            case HEARTBEAT:
                return "Heartbeat Sensor";
            case HOLOGRAPHIC:
                return "Holographic Sight";
            case RAPIDFIRE:
                return "Rapid Fire";
            case REDDOT:
                return "Red Dot Sight";
            case SHOTGUN:
                return "Shotgun";
            case SILENCER:
                return "Silencer";
            case TACTICALKNIFE:
                return "Tactical Knife";
            case THERMAL:
                return "Thermal";
            default:
                return "Uavailable";
        }
    }

    public int getImageResource() {
        switch(this) {
            case ACOG:
                return R.drawable.acogscope;
            case AKIMBO:
                return R.drawable.akimbo;
            case EXTENDEDMAGS:
                return R.drawable.extendedmags;
            case FMJ:
                return R.drawable.fmj;
            case GRENADELAUNCHER:
                return R.drawable.grenadelauncher;
            case GRIP:
                return R.drawable.grip;
            case HEARTBEAT:
                return R.drawable.heartbeatsensor;
            case HOLOGRAPHIC:
                return R.drawable.holographicsight;
            case RAPIDFIRE:
                return R.drawable.rapidfire;
            case REDDOT:
                return R.drawable.reddotsight;
            case SHOTGUN:
                return R.drawable.shotgun;
            case SILENCER:
                return R.drawable.silencer;
            case TACTICALKNIFE:
                return R.drawable.tacticalknife;
            case THERMAL:
                return R.drawable.thermalsight;
            default:
                return 0;
        }
    }
}
