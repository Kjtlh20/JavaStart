package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input five digit number");
        int number = sc.nextInt();
        int digit1 = number / 10000;
        int digit2 = number / 1000 % 10;
        int digit3 = number / 100 % 10;
        int digit4 = number / 10 % 10;
        int digit5 = number % 10;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);
    }
}
