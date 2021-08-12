package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[] a = getArray(n);
        int value = 5;
        int index = getArrayIndex(a, value);
        System.out.println(Arrays.toString(a));
        System.out.println("value: " + value);
        System.out.println("index: " + index);
    }

    public static int[] getArray(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(11);
        }
        return array;
    }

    public static int getArrayIndex(int[] a, int value) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }
}
