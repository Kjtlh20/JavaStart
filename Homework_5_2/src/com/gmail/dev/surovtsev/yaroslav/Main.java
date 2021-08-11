package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input a[" + i + "]");
            int el = sc.nextInt();
            a[i] = el;
        }
        System.out.println("a = " + Arrays.toString(a));
    }
}
