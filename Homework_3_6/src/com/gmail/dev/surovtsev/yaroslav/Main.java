package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int xA = 0;
	    int yA = 0;
	    int xB = 4;
	    int yB = 4;
	    int xC = 6;
	    int yC = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x coordinate");
        int xO = sc.nextInt();
        System.out.println("Input y coordinate");
        int yO = sc.nextInt();
        int a = (xA - xO) * (yB - yA) - (xB - xA) * (yA - yO);
        int b = (xB - xO) * (yC - yB) - (xC - xB) * (yB - yO);
        int c = (xC - xO) * (yA - yC) - (xA - xC) * (yC - yO);
        if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)) {
            System.out.println("Point in a triangle");
        } else {
            System.out.println("Point not in a triangle");
        }
    }
}
