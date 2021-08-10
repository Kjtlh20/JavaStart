package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number 1");
        int number1 = sc.nextInt();
        System.out.println("Input number 2");
        int number2 = sc.nextInt();
        System.out.println("Input number 3");
        int number3 = sc.nextInt();
        System.out.println("Input number 4");
        int number4 = sc.nextInt();
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number4 > max) {
            max = number4;
        }
        System.out.println("max = " + max);
    }
}
