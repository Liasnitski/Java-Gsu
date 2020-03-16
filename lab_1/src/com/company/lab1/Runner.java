package com.company.lab1;
import by.gsu.pms.Icecream;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Icecream[] icecreams = {
                new Icecream("TwoIcecream", false, 77),
                new Icecream("OneIcecream", true, 88),
                new Icecream("ThreeIcecream", true, 66),
                new Icecream("FourIcecream", false, 55),
                new Icecream("FiveIcecream", true, 44),
                new Icecream("SixIcecream", false, 33),
                new Icecream("SevenIcecream", true, 22),
                new Icecream("EightIcecream", false, 11),
        };

        for (Icecream icecream : icecreams) {
            if (icecream != null) {
                icecream.show();
                System.out.println();
            }
        }

        double totalFat = 0;
        int chocolateNumber = 0;

        for (int i = 0; i < icecreams.length; ++i) {
            System.out.println(icecreams[i]);
            if (icecreams[i].getChocolate()) {
                chocolateNumber++;
            }
            totalFat += icecreams[i].getFat();
        }

        Arrays.sort(icecreams);
        System.out.println();

        for (int i = 0; i < icecreams.length; ++i) {
            System.out.println(icecreams[i].toString());
        }

        Arrays.sort(icecreams, Icecream.IcecreamNameComparator);
        System.out.println();

        for (int i = 0; i < icecreams.length; ++i) {
            System.out.println(icecreams[i].toString());
        }

        System.out.printf("\nAverage Fat: %.2f ", totalFat/icecreams.length);
        System.out.printf("\nChocolate: %d ", chocolateNumber);

    }
}