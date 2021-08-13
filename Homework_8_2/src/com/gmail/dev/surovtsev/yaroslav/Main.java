package com.gmail.dev.surovtsev.yaroslav;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        int[][] a = getArray(n, m);
        writeArrayToFile(a, n, m);
    }

    public static void writeArrayToFile(int[][] a, int n, int m) {
        try (PrintWriter pw = new PrintWriter("New file.txt")) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    pw.print(a[i][j] + "   ");
                }
                pw.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[][] getArray(int n, int m) {
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = 999;
            }
        }
        return a;
    }
}
