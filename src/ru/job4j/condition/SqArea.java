package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {

        double h = p / (2 * (k + 1)) ;

        return Math.pow(h,2) * k;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 2, real = " + result1);
    }
}
