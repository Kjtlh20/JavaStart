package com.gmail.dev.surovtsev.yaroslav;

public class Main {

    public static void main(String[] args) {
        String text = "Write a method that will return the number of words in a line of text";
        System.out.println(text);
        int c = getNumberOfWords(text);
        System.out.println("Number of words: " + c);
    }

    public static int getNumberOfWords(String text) {
        String[] array = text.split("[ ]");
        int c = array.length;
        return c;
    }
}
