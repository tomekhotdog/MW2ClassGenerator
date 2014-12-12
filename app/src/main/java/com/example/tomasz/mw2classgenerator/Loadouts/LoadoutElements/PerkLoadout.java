package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;


public class PerkLoadout {

    Perk perk1;
    Perk perk2;
    Perk perk3;

    public PerkLoadout(Perk p1, Perk p2, Perk p3) {
        this.perk1 = p1;
        this.perk2 = p2;
        this.perk3 = p3;
    }

    public Perk getPerk(int category) {
        switch(category) {
            case 1:
                return perk1;
            case 2:
                return perk2;
            case 3:
                return perk3;
            default:
                return null;
        }
    }
}
