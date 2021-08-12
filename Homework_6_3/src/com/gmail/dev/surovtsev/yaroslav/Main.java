package com.gmail.dev.surovtsev.yaroslav;

public class Main {

    public static void main(String[] args) {
        int w = 10;
        int h = 5;
        printRectangle(w, h);
    }

    public static void printRectangle(int w, int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
