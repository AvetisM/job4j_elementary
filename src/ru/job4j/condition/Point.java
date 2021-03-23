package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {

        double first = x2 - x1;
        double second = y2 - y1;

        first =  Math.pow(first, 2);
        second =  Math.pow(second, 2);

        return first + second;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(4, 6, 12, 10);
        System.out.println("result (4, 6) to (12, 10) " + result);

        result = Point.distance(-2, -1, 2, 1);
        System.out.println("result (-2, -1) to (2, 1) " + result);
    }
}
