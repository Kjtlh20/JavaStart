package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int n = 6;
        int[][] m = getArray(n);
        printMatrixToConsole(m);
        rotateMatrix(m);
        printMatrixToConsole(m);
        rotateMatrix(m);
        printMatrixToConsole(m);
        rotateMatrix(m);
        printMatrixToConsole(m);
    }

    public static int[][] getArray(int n) {
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = j + 1;
            }
        }
        return m;
    }

    public static int[][] rotateMatrix(int[][] m) {
        int n = m.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int temp = m[i][j];
                m[i][j] = m[n - 1 - j][i];
                m[n - 1 - j][i] = m[n - 1 - i][n - 1 - j];
                m[n - 1 - i][n - 1 - j] = m[j][n - 1 - i];
                m[j][n - 1 - i] = temp;
            }
        }
        return m;
    }

    public static void printMatrixToConsole(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
        System.out.println();
    }
}
