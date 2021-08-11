package com.gmail.dev.surovtsev.yaroslav;

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j <= 100; j++) {
                if (i != j && i % j == 0) {
                    isPrimeNumber = false;
                }
            }
            if (isPrimeNumber) {
                System.out.print(i + ", ");
            }
        }
    }
}
