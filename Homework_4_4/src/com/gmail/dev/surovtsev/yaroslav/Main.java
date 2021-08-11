package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input h");
        int h = sc.nextInt();
        System.out.println("Input w");
        int w = sc.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h-1 || j == 0 || j == w-1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
