package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 15;
        Random random = new Random();
        int[] a = new int[n];
        int[] b = new int[n * 2];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(11);
            b[i] = a[i];
            b[i + n] = a[i] * 2;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
