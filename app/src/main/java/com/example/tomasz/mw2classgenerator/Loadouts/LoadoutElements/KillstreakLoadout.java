package com.example.tomasz.mw2classgenerator.Loadouts.LoadoutElements;

public class KillstreakLoadout {
    KillStreak k1;
    KillStreak k2;
    KillStreak k3;

    public KillstreakLoadout(KillStreak k1, KillStreak k2, KillStreak k3) {
        int k1kills = k1.getKillsRequired();
        int k2kills = k2.getKillsRequired();
        int k3kills = k3.getKillsRequired();

        //Juggling so that killstream appear in order of kills required, ascending
        if(k1kills >= k2kills && k1kills >= k3kills) {
            this.k3 = k1;
            if(k2kills >= k3kills) {
                this.k2 = k2;
                this.k1 = k3;
            } else {
                this.k2 = k3;
                this.k1 = k2;
            }
        } else if (k2kills >= k1kills && k2kills >= k3kills) {
            this.k3 = k2;
            if(k1kills >= k3kills) {
                this.k2 = k1;
                this.k1 = k3;
            } else {
                this.k2 = k3;
                this.k1 = k1;
            }
        } else {
            this.k3 = k3;
            if(k1kills >= k2kills) {
                this.k2 = k1;
                this.k1 = k2;
            } else {
                this.k2 = k2;
                this.k1 = k1;
            }
        }
    }

    public KillStreak getKillStreak(int k) {
        switch(k) {
            case 1:
                return k1;
            case 2:
                return k2;
            case 3:
                return k3;
            default:
                return null;
        }
    }
}
