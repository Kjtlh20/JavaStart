package com.gmail.dev.surovtsev.yaroslav;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int entranceCount = 4;
        int floorCount = 9;
        int flatOnFloor = 4;
        int flatCount = flatOnFloor * floorCount * entranceCount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input flat number");
        int flatNumber = sc.nextInt();
        if (flatNumber < 1 || flatNumber > flatCount) {
            System.out.println("Wrong flat number");
        } else {
            int entrance = (flatNumber - 1) / (entranceCount * floorCount) + 1;
            int floor = (flatNumber - (entrance - 1) * floorCount * flatOnFloor) / flatOnFloor;
            System.out.println("entrance = " + entrance);
            System.out.println("floor = " + floor);
        }
    }
}
