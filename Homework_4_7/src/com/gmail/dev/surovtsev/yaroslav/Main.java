package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input w");
        int w = sc.nextInt();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < w; j++) {
                if ((i <= w / 2 && j > i - 1 && j < w - i) || (i > w / 2 && j > w - i - 2 && j < i + 1)) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
