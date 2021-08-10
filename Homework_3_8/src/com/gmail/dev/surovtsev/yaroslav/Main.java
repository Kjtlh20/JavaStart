package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input six digit number");
        int number = sc.nextInt();
        int digit1 = number / 100000;
        int digit2 = number / 10000 % 10;
        int digit3 = number / 1000 % 10;
        int digit4 = number / 100 % 10;
        int digit5 = number / 10 % 10;
        int digit6 = number % 10;
        if (digit1 == digit6 && digit2 == digit5 && digit3 == digit4) {
            System.out.println("The number is a palindrome :)");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}
