package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input side a");
        int a = sc.nextInt();
        System.out.println("Input side b");
        int b = sc.nextInt();
        System.out.println("Input side c");
        int c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Triangle exists");
        } else {
            System.out.println("Wrong triangle");
        }
    }
}
