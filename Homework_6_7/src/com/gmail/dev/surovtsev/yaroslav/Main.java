package com.gmail.dev.surovtsev.yaroslav;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        int max = 0;
        boolean isPalindrome = false;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                number = i * j;
                isPalindrome = checkPalindrome(number);
                if (isPalindrome && number > max) {
                    max = number;
                }
            }
        }
        System.out.println("Max palindrome: " + max);
    }

    public static boolean checkPalindrome(int number) {
        boolean isPalindrome = true;
        char[] array = Integer.toString(number).toCharArray();
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            if (array[i] != array[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
