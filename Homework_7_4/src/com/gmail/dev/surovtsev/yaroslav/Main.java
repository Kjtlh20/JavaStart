package com.gmail.dev.surovtsev.yaroslav;

import java.util.Formatter;

public class Main {

    public static void main(String[] args) {
        double pi = Math.PI;
        for (int i = 2; i < 12; i++) {
            Formatter form = new Formatter();
            form.format("%." + i + "f", pi);
            String text = form.toString();
            System.out.println(text);
        }
    }
}
