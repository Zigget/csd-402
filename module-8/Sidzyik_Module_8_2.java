/*
Made by: Samuel Sidzyik
Module 8.2
Start Date May 3, 2026

Grabbing highest int from array list

https://github.com/Zigget/csd-402/blob/main/module-8/Sidzyik_Module_8_2.java
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Sidzyik_Module_8_2 {

    // Method to find the maximum value
    public static int max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        int maxValue = list.get(0);

        for (int num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (whole numbers, not 6.7)\n(Enter 0 to stop):");

        int value;
        do {
            value = input.nextInt();
            numbers.add(value); // includes 0
        } while (value != 0);

        int result = max(numbers);

        System.out.println("The largest value is..: " + result);

        input.close();
    }
}