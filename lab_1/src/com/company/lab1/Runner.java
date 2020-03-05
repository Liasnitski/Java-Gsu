package com.company.lab1;
import by.gsu.pms.Icecream;

import by.gsu.pms.Icecream;

public class Runner {

    public static void main(String[] args) {
        Icecream[] icecreams = {
                new Icecream("OneIcecream", true, 88),
                null,
                new Icecream("TwoIcecream", false, 77),
                new Icecream("ThreeIcecream", true, 66),
                new Icecream("FourIcecream", false, 55),
                new Icecream("FiveIcecream", true, 44),
                new Icecream("SixIcecream", false, 33),
                new Icecream("SevenIcecream", true, 22),
                new Icecream("EightIcecream", false, 11),
                new Icecream()
        };

        for (Icecream icecream : icecreams) {
            if (icecream != null) {
                icecream.show();
                System.out.println();
            }
        }

        for (Icecream icecream : icecreams) {
            if (icecream != null) {
                System.out.println(icecream.toString());
            }

        }

    }
}