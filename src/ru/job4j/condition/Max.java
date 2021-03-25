package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int left = 10;
        int right = 12;
        int max = Max.max(left, right);
        System.out.println("left " + left + " right " + right + " max " + max);
    }
}
