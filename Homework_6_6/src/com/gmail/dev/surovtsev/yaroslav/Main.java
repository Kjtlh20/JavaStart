package com.gmail.dev.surovtsev.yaroslav;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input sequence");
        String str = sc.nextLine();
        String[] array = str.split("[,]");
        int[] seq = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            seq[i] = Integer.parseInt(array[i]);
        }
        int nextElement = getNextElement(seq);
        if (nextElement == 0) {
            System.out.println("Unknown sequence");
        } else {
            System.out.println("Next element: " + nextElement);
        }
    }

    public static int getNextElement(int[] seq) {
        int nextElement = 0;
        boolean elementFind = false;
        int n = seq.length;
        boolean isArithmeticProgression = checkArithmeticProgression(seq);
        if (isArithmeticProgression && !elementFind) {
            int k = seq[n - 1] - seq[n - 2];
            nextElement = seq[n - 1] + k;
            elementFind = true;
        }
        boolean isGeometricProgression = checkGeometricProgression(seq);
        if (isGeometricProgression && !elementFind) {
            int k = seq[n - 1] / seq[n - 2];
            nextElement = seq[n - 1] * k;
            elementFind = true;
        }
        boolean isSquareProgression = checkSquareProgression(seq);
        if (isSquareProgression && !elementFind) {
            int k = (int) (Math.sqrt(seq[n - 1]) - Math.sqrt(seq[n - 2]));
            int el = (int) Math.sqrt(seq[n - 1]) + k;
            nextElement = (int) (Math.pow(el, 2));
            elementFind = true;
        }
        boolean isCubeProgression = checkCubeProgression(seq);
        if (isCubeProgression && !elementFind) {
            int k = (int) (Math.cbrt(seq[n - 1]) - Math.cbrt(seq[n - 2]));
            int el = (int) Math.cbrt(seq[n - 1]) + k;
            nextElement = (int) (Math.pow(el, 3));
            elementFind = true;
        }
        return nextElement;
    }

    public static boolean checkArithmeticProgression(int[] seq) {
        boolean isArithmeticSequence = true;
        int k = seq[1] - seq[0];
        int next;
        for (int i = 1; i < seq.length - 1; i++) {
            next = seq[i + 1] - seq[i];
            if (k != next) {
                isArithmeticSequence = false;
                break;
            }
        }
        return isArithmeticSequence;
    }

    public static boolean checkGeometricProgression(int[] seq) {
        boolean isGeometricProgression = true;
        if (seq[0] == 0) {
            isGeometricProgression = false;
            return isGeometricProgression;
        }
        int k = seq[1] / seq[0];
        int next;
        for (int i = 1; i < seq.length - 1; i++) {
            next = seq[i + 1] / seq[i];
            if (k != next) {
                isGeometricProgression = false;
                break;
            }
        }
        return isGeometricProgression;
    }

    public static boolean checkSquareProgression(int[] seq) {
        boolean isSquareProgression = true;
        int k = (int) (Math.sqrt(seq[1]) - Math.sqrt(seq[0]));
        int next;
        for (int i = 1; i < seq.length - 1; i++) {
            next = (int) (Math.sqrt(seq[i + 1]) - Math.sqrt(seq[i]));
            if (k != next) {
                isSquareProgression = false;
                break;
            }
        }
        return isSquareProgression;
    }

    public static boolean checkCubeProgression(int[] seq) {
        boolean isCubeProgression = true;
        int k = (int) (Math.cbrt(seq[1]) - Math.cbrt(seq[0]));
        int next;
        for (int i = 1; i < seq.length - 1; i++) {
            next = (int) (Math.cbrt(seq[i + 1]) - Math.cbrt(seq[i]));
            if (k != next) {
                isCubeProgression = false;
                break;
            }
        }
        return isCubeProgression;
    }
}
