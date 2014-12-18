package com.example.tomasz.mw2classgenerator.Utils;

import com.example.tomasz.mw2classgenerator.Constants;

public class UtilityMethods {


    public static int getLoadoutType(int fragmentSelection) {
        switch(fragmentSelection) {
            case 0:
                return Constants.TYPE_RANDOM;
            case 1:
                return Constants.TYPE_AGGRESSIVE;
            case 2:
                return Constants.TYPE_DEFENSIVE;
            default:
                return Constants.TYPE_WACKY;
        }
    }
}
