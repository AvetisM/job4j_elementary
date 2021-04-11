package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int coinChange = money - price;

        while (coinChange > 0) {
            for (int i = 0; i < coins.length;) {
                if (coinChange >= coins[i]) { //если выполняется условие, то не увеличиваю индекс, чтобы монета осталась той же
                    coinChange -= coins[i];
                    rsl[size] = coins[i];
                    size += 1;
                } else {
                    i += 1;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
