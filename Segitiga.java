package com.uas;

public class Segitiga implements BangunDatar {

    Segitiga() {}

    @Override
    public double luas(double s1, double s2) {
        return (0.5 * s1 * s2);
    }

    @Override
    public double keliling(double s1, double s2) {
        return (s1 + s2 + sisiMiring(s1, s2));
    }

    public double sisiMiring(double s1, double s2) {
        return Math.sqrt((s1 * s1) + (s2 * s2));
    }
}
