/*
Made by: Samuel Sidzyik
Module 4.2
Start Date April 12, 2026

Making Arrays and filling with Dummy Data before averaging them out.

https://github.com/Zigget/csd-402/blob/main/module-4/Sidzyik_Module_4_2.java
*/
public class Sidzyik_Module_4_2 {
    
    public static void main(String[] args) {
        // Not Going to max these ranges
        short[] sArr = {2, 4, 8, 16, 32}; 
        int[] iArr = {100, 200, 300, 400};
        long[] lArr = {10L, 200L, 3000L, 4L, 500L};
        double[] dArr = {4.2, 6.9, 6.7, 1.3, 9.99, 1.23};

        System.out.println("Average: " + average(sArr));
        System.out.println("Short Values: ");
        displayArray(sArr);
        System.out.println();

        System.out.println("Average: " + average(iArr));
        System.out.println("Int Values: ");
        displayArray(iArr);
        System.out.println();

        System.out.println("Average: " + average(lArr));
        System.out.println("Long Valus: ");
        displayArray(lArr);
        System.out.println();

        System.out.println("Average: " + average(dArr));
        System.out.println("Double Values: ");
        displayArray(dArr);
    }

    public static short average(short[] array) {
        int sum = 0;
        for (short n : array) {
            sum += n;
        }
        return (short)(sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long n : array) {
            sum += n;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double n : array) {
            sum += n;
        }
        return sum / array.length;
    }

    public static void displayArray(short[] arr) {
        for (short n : arr) System.out.print(n + " ");
        System.out.println();
    }

    public static void displayArray(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }

    public static void displayArray(long[] arr) {
        for (long n : arr) System.out.print(n + " ");
        System.out.println();
    }

    public static void displayArray(double[] arr) {
        for (double n : arr) System.out.print(n + " ");
        System.out.println();
    }
}