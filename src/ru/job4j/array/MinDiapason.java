package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        int indexFinish = array.length - 1 < finish ? array.length - 1 : finish;
        for (int index = start; index <= indexFinish; index++) {
            min = min < array[index] ? min : array[index];
        }
        return min;
    }
}
