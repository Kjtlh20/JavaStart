package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input r");
        int r = sc.nextInt();
        double l = 2 * Math.PI * r;
        System.out.println("l = " + l);
    }
}
