package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[] array = getArray(n);
        int max = getMaxElement(array);
        System.out.println(Arrays.toString(array));
        System.out.println("max: " + max);
    }

    public static int[] getArray(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(21);
        }
        return array;
    }

    public static int getMaxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
