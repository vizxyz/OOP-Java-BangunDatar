package com.uas;

public class Lingkaran implements BangunDatar {

    private final double pi = 3.14;

    Lingkaran() {}

    @Override
    public double luas(double s1, double s2) {
        return 0;
    }

    @Override
    public double keliling(double s1, double s2) {
        return 0;
    }

    public double luas(double r) { //metode overload
        return (pi * r * r);
    }

    public double keliling(double r) { //metode overload
        return (2 * pi * r);
    }
}
