package com.gmail.dev.surovtsev.yaroslav;

public class Main {

    public static void main(String[] args) {
	    int[] a = {0, 5, 2, 4, 7, 1, 3, 19};
	    int i = 0;
        for (int el: a) {
            if (el % 2 != 0) {
                i = i + 1;
            }
        }
        System.out.println("Odd numbers: " + i);
    }
}
