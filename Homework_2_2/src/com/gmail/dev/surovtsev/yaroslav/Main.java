package com.gmail.dev.surovtsev.yaroslav;

public class Main {

    public static void main(String[] args) {
	    int a = 10;
	    int b = 4;
	    int c = 7;
	    double p = (a + b + c) / 2.0;
	    double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("s = " + s);
    }
}
