package com.gmail.dev.surovtsev.yaroslav;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        printDirectoryList(path);
    }

    public static void printDirectoryList(String path) {
        File directory = new File(path);
        if (!directory.isDirectory()) {
            return;
        }
        String[] list = directory.list();
        for (String el : list) {
            File elDir = new File(el);
            if (!elDir.isDirectory()) {
                continue;
            }
            System.out.println(el);
        }
    }
}
