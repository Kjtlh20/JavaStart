package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input h");
        int h = sc.nextInt();
        int i = 0;
        int j = 0;
        while (i < h * 2 - 1) {
            System.out.print("*  ");
            j = j + 1;
            if ((i <= h - 1 && j == i + 1) || (i > h - 1 && j == (h * 2 - 1) - i)) {
                System.out.println("");
                i = i + 1;
                j = 0;
            }
        }
    }
}
