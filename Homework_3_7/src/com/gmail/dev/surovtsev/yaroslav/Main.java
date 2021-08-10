package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input four digit number");
        int number = sc.nextInt();
        int digit1 = number / 1000;
        int digit2 = number / 100 % 10;
        int digit3 = number / 10 % 10;
        int digit4 = number % 10;
        if (digit1 + digit2 == digit3 + digit4) {
            System.out.println("Lucky ticket :)");
        } else {
            System.out.println("Ticket is not lucky");
        }
    }
}
