package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int r = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x");
        int x = sc.nextInt();
        System.out.println("Input y");
        int y = sc.nextInt();
        if (x*x + y*y <= r*r) {
            System.out.println("Point in a circle");
        } else {
            System.out.println("Point not in a circle");
        }
    }
}
