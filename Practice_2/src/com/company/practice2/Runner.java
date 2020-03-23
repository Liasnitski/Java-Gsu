package com.company.practice2;

import by.gsu.pms.Subject;
import by.gsu.pms.UniformMaterial;

public class Runner {
    public static void main(String[] args) {

        Subject Wire = new Subject();

        Wire.setNameOfSubject("wire");
        Wire.setVolumeOfSubject(0.03);

        Wire.setNameOfMaterial("steel");
        Wire.setDensityOfMaterial(7850);

        System.out.println(Wire.toString());

        Wire.setNameOfMaterial("copper");
        Wire.setDensityOfMaterial(8500);

        System.out.println(Wire.toString());

        Wire.setNameOfMaterial("steel");
        Wire.setDensityOfMaterial(7850);

        System.out.println(Wire.toString());

    }
}

