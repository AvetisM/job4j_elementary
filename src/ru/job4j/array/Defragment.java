package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int notNullIndex = index; notNullIndex < array.length; notNullIndex++) {
                    if (array[notNullIndex] != null) {
                        swap(array, index, notNullIndex);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }

    public static void swap(String[] data, int index1, int index2) {
        String temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
}

