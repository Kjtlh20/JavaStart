package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] a = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven"
                , "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
                , "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"
                , "thousand", "million"};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50, 60, 70, 80, 90
                , 100, 1000, 1000000};
        Scanner sc = new Scanner(System.in);
        System.out.println("Input sum");
        double sum = sc.nextDouble();
        int millions = (int) (sum / 1000000 % 1000);
        int thousands = (int) (sum / 1000 % 1000);
        int hundreds = (int) (sum % 1000);
        int cents = (int) (sum * 100 % 100);
        String text = "";
        String textMillions = getNumberInWords(millions, 1000000, a, b);
        if (!textMillions.isEmpty()) {
            text = text + textMillions;
        }
        String textThousands = getNumberInWords(thousands, 1000, a, b);
        if (!textThousands.isEmpty()) {
            text = text + textThousands;
        }
        String textHundreds = getNumberInWords(hundreds, 0, a, b);
        if (!textHundreds.isEmpty()) {
            text = text + textHundreds;
        }
        if (!text.isEmpty()) {
            text = text + "dollars ";
        }
        String textCents = getNumberInWords(cents, 0, a, b);
        if (!textCents.isEmpty()) {
            text = text + textCents + "cents";
        }
        System.out.println(text);
    }

    public static String getNumberInWords(int number, int rank, String[] a, int[] b) {
        String text = "";
        int index;
        int number100 = number / 100;
        int number10 = number % 100 / 10;
        int number1 = number % 10;
        if (number100 != 0) {
            index = getArrayIndex(b, number100);
            text = text + a[index] + " hundreds ";
        }
        if (number10 != 0) {
            if (number10 * 10 + number1 <= 20) {
                index = getArrayIndex(b, number10 * 10 + number1);
            } else {
                index = getArrayIndex(b, number10 * 10);
            }
            text = text + a[index] + " ";
        }
        if (number1 != 0 && (number10 * 10 + number1 > 20 || number10 * 10 + number1 < 10)) {
            index = getArrayIndex(b, number1);
            text = text + a[index] + " ";
        }
        index = getArrayIndex(b, rank);
        if (number != 0 && index != -1) {
            text = text + a[index] + " ";
        }
        return text;
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
