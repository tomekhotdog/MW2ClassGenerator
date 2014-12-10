package com.example.tomasz.mw2classgenerator.Loadouts.WeaponEnums;

import java.util.ArrayList;

public enum SecondaryWeaponType {
    MACHINEPISTOL, SHOTGUN, HANDGUN, LAUNCHER;

    //Returns the arraylist including with available attachments. SecondaryAdditional type may be null
    public ArrayList<WeaponAttachments> getAttachments(SecondaryWeaponType type, SecondaryAdditional secondaryAdditional) {
        ArrayList<WeaponAttachments> ats = new ArrayList<WeaponAttachments>();
        switch (type) {
            case MACHINEPISTOL:
                ats.add(WeaponAttachments.AKIMBO);
                ats.add(WeaponAttachments.EXTENDEDMAGS);
                ats.add(WeaponAttachments.FMJ);
                ats.add(WeaponAttachments.HOLOGRAPHIC);
                ats.add(WeaponAttachments.REDDOT);
                ats.add(WeaponAttachments.SILENCER);
                break;

            case SHOTGUN:
                switch (secondaryAdditional) {
                    case SPAS12: //fall through
                    case AA12:   //for same attachments
                    case STRIKER:
                    case M1014:
                        ats.add(WeaponAttachments.EXTENDEDMAGS);
                        ats.add(WeaponAttachments.FMJ);
                        ats.add(WeaponAttachments.GRIP);
                        ats.add(WeaponAttachments.HOLOGRAPHIC);
                        ats.add(WeaponAttachments.REDDOT);
                        ats.add(WeaponAttachments.SILENCER);
                        break;

                    case RANGER:
                    case MODEL1887:
                        ats.add(WeaponAttachments.AKIMBO);
                        ats.add(WeaponAttachments.FMJ);
                        break;

                    default:
                }
                break;

            case HANDGUN:
                switch (secondaryAdditional) {
                    case USP:
                    case M9:
                        ats.add(WeaponAttachments.AKIMBO);
                        ats.add(WeaponAttachments.EXTENDEDMAGS);
                        ats.add(WeaponAttachments.FMJ);
                        ats.add(WeaponAttachments.SILENCER);
                        ats.add(WeaponAttachments.TACTICALKNIFE);
                        break;

                    case MAGNUM:
                    case DESERTEAGLE:
                        ats.add(WeaponAttachments.AKIMBO);
                        ats.add(WeaponAttachments.FMJ);
                        ats.add(WeaponAttachments.TACTICALKNIFE);
                        break;

                    default:
                }
                break;

            case LAUNCHER:

            default:

        }
        return ats;
    }
}
