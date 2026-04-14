/*
Made by: Samuel Sidzyik
Module 3.2
Start Date April 13, 2026

Making Nested loop to create pyramid.

Part of set of late assignments. I still don't know if my Java is set up right...
Went around my failures setting up and just went with Java plugin on VSCode

Between holidays and illness I'm getting a real late jump in this course. Hoping to turn this around soon

https://github.com/Zigget/csd-402/blob/main/module-3/Sidzyik_Module_3_2.java
*/
public class Sidzyik_Module_3_2 {
    
     public static void main(String[] args) throws Exception {

        // Initialize vars
        int NumberOfRows = 8;
        int NewLine;
        String[] lineValue = new String[NumberOfRows];

        // Set up rows
        for (int i = 0; i+1 <= NumberOfRows; i++) {
            lineValue[i] = "";

            lineValue[i] += " ".repeat((NumberOfRows - i-1)*2);

            int num = 1;

            // Values going up
            for (int j = 1; j <= i+1; j++) {
                lineValue[i] += num + " ";
                num *= 2;
            }

            // Values going down
            num /= 4;
            for (int j = 1; j < i+1; j++) {
                lineValue[i] += num + " ";
                num /= 2;
            }
        }
    
        // Print Values
        for (int i = 0; i < NumberOfRows; i++) {
            
            NewLine = lineValue[NumberOfRows-1].length() - lineValue[i].length();
            lineValue[i] += " ".repeat(NewLine);


            System.out.println(lineValue[i] + "@");
        }
    }
}