package com.gmail.dev.surovtsev.yaroslav;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text");
        String text = sc.nextLine();
        File file = new File("New file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Path to your file " + file.getAbsolutePath());
    }
}
