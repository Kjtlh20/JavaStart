package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] a = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven"
                , "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
                , "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"
                , "thousand", "million", "billion"};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50, 60, 70, 80, 90
                , 100, 1000, 1000000, 1000000000};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input sum");
//        double sum = sc.nextDouble();
        //double sum = 444333777555.22;
        double sum = 525.14;
        int billions = (int) (sum / 1000000000);
        int millions = (int) (sum / 1000000 % 1000);
        int thousands = (int) (sum / 1000 % 1000);
        int hundreds = (int) (sum / 100 % 10);
        int tens = (int) (sum % 100);
        int units = (int) (sum % 10);
        int cents = (int) (sum * 100 % 100);
        System.out.println("billions: " + billions);
        System.out.println("millions: " + millions);
        System.out.println("thousands: " + thousands);
        System.out.println("hundreds: " + hundreds);
        System.out.println("tens: " + tens);
        System.out.println("units: " + units);
        System.out.println("cents: " + cents);
        int index1 = -1;
        int index2 = -1;
        String text = "";
        if (hundreds != 0) {
            index1 = getArrayIndex(b, hundreds);
            index2 = getArrayIndex(b, 100);
            text = text + a[index1] + " " + a[index2] + " ";
        }
        if (tens != 0) {
            if (tens < 20) {
                index1 = getArrayIndex(b, tens);
                text = text + a[index1];
            } else {
                int tens1 = tens / 10 * 10;
                int tens2 = tens % 10;
                index1 = getArrayIndex(b, tens1);
                index2 = getArrayIndex(b, tens2);
                text = text + a[index1] + " " + a[index2] + " ";
            }
        }
        text = text + "dollars ";
        if (cents != 0) {
            if (cents < 20) {
                index1 = getArrayIndex(b, cents);
                text = text + a[index1] + " ";
            } else {
                int cents1 = cents / 10 * 10;
                int cents2 = cents % 10;
                index1 = getArrayIndex(b, cents1);
                index2 = getArrayIndex(b, cents2);
                text = text + a[index1] + " " + a[index2] + " ";
            }
        }
        text = text + "cents ";
        System.out.println(text);
    }

    public static int getArrayIndex(int[] a, int value) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                index = i;
            }
        }
        return index;
    }
}
