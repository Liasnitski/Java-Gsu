package com.company.lab_5;
import by.gsu.pms.Icecream;
import by.gsu.pms.Serialization;
import by.gsu.pms.Deserialization;
import exceptions.NumberOfChocolateException;
import exceptions.TotalFatException;

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


        Serialization.serialize(icecreams);
        System.out.println("Icecreams Serialized");


        double totalFat = 0;
        int icecreamWithChocolate = 0;

        try {
            for (int i = 0; i < icecreams.length; ++i) {
                System.out.println(icecreams[i]);
                if (icecreams[i].getChocolate()) {
                    icecreamWithChocolate++;
                }
                totalFat += icecreams[i].getFat();

                if (totalFat > 1000) {
                    TotalFatException ex = new TotalFatException("To much fat.");
                    throw ex;
                }
                if (icecreamWithChocolate > 10) {
                    NumberOfChocolateException ex = new NumberOfChocolateException("To much icecreams with chocolate.");
                    throw ex;
                }
            }
        } catch (NullPointerException ex) {
            System.out.println("Bad pointer!");
        } catch (NumberOfChocolateException ex) {
            ex.printStackTrace();
        } catch (TotalFatException ex) {
            ex.printStackTrace();
        }

        System.out.printf("\nAverage Fat: %.2f ", totalFat/icecreams.length);
        System.out.printf("\nChocolate: %d ", icecreamWithChocolate);

        System.out.println("\n");

        Deserialization.deserialization("icecreams.dat");
        System.out.println("Icecreams Deserialized");

    }
}