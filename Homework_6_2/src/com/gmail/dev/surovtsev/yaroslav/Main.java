package com.gmail.dev.surovtsev.yaroslav;

public class Main {

    public static void main(String[] args) {
        String a = "PI = ";
        int b = 3;
        double c = 0.1415926535;
        String result = getConcat(a, b, c);
        System.out.println(result);
    }

    public static String getConcat(String a, int b, double c) {
        return a + (b + c);
    }
}
