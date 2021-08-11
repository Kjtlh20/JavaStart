package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text");
        String text = sc.nextLine();
        char[] a = text.toCharArray();
        int c = 0;
        for (char el : a) {
            if (el == 'b') {
                c = c + 1;
            }
        }
        System.out.println("Number of characters 'b': " + c);
    }
}
