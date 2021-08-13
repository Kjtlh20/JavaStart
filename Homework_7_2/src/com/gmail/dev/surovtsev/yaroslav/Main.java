package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[] a = getArray(n);
        System.out.println(Arrays.toString(a));
        System.out.println(getStringFromArray(a));
    }

    public static String getStringFromArray(int[] a) {
        int n = a.length;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < n; i++) {
            sb.append(a[i]);
            if (i != n - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static int[] getArray(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
}
