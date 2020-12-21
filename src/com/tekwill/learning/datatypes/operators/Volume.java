package com.tekwill.learning.datatypes.operators;

public class Volume {
    public static final double PI = Math.PI;

    public static double TheVolume(double r) {
        double TheVolume = 4 / 3D * PI * Math.pow(r, 3);
        return TheVolume;
    }

    public static void main(String[] args) {

        System.out.println(TheVolume(10));
    }
}
