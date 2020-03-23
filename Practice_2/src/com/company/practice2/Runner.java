package com.company.practice2;

import by.gsu.pms.Subject;
import by.gsu.pms.UniformMaterial;

public class Runner {
    public static void main(String[] args) {

        Subject Wire = new Subject();

        UniformMaterial STEEL = UniformMaterial.STEEL;
        Wire.setNameOfSubject("wire");
        Wire.setVolumeOfSubject(0.03);
        Wire.setUniformMaterial(STEEL);

        System.out.println(Wire.toString());

        UniformMaterial COOPER = UniformMaterial.COOPER;
        Wire.setUniformMaterial(COOPER);

        System.out.println(Wire.toString());

        Wire.setUniformMaterial(STEEL);

        System.out.println(Wire.toString());

    }
}

