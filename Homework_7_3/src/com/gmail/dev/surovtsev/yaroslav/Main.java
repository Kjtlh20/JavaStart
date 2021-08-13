package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input binary number");
        String binaryNumber = sc.nextLine();
        int decimalNumber;
        try {
            decimalNumber = Integer.parseInt(binaryNumber, 2);
        } catch (NumberFormatException e) {
            System.out.println(e);
            return;
        }
        System.out.println(binaryNumber + " -> " + decimalNumber);
    }
}
