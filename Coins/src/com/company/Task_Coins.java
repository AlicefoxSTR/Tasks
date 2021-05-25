package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Task_Coins {
        public static int maxCoins(int[] heap) {
            Arrays.sort(heap);
            int res = 0, n = heap.length;
            for (int i = n / 3; i < n; i += 2)
                res += heap[i];
            return res;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите кол-во чисел:");
            int sum = Integer.parseInt(scanner.nextLine()); // Считываем кол-во
            if (sum > 0) {
                int[] coins = new int[sum];
                System.out.println("Введите значения:");
                for (int i = 0; i < sum; i++) {
                    coins[i] = Integer.parseInt(scanner.nextLine());
                    if (coins[i] < 0) {
                        System.out.println("Значения монет не могут быть отрицательными!");
                        System.exit(0);
                    }
                }
                int ans = maxCoins(coins);
                System.out.println(ans);
            } else {
                System.out.println("Невозможно!");
            }
        }
    }


