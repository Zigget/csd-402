/*
Made by: Samuel Sidzyik
Module 2.2
Start Date April 13, 2026

Rock Paper Scissors. I really tried to make this a switch statment.
That just isn't the best use case or maybe I'm missing something.
I even tried plugging that idea into AI and it just put ifs inside the switch and made it look messy.
I went with my original work which isn't as fancy as I wanted but was a more straight forwad approach

Part of set of late assignments. I still don't know if my Java is set up right...
Went around my failures setting up and just went with Java plugin on VSCode

Between holidays and illness I'm getting a real late jump in this course. Hoping to turn this around soon

https://github.com/Zigget/csd-402/blob/main/module-2/Sidzyik_Module_2_2.java
*/

import java.util.Scanner;

public class Sidzyik_Module_2_2 {
    
     public static void main(String[] args) {

        // Initialize vars
        Scanner UserInput = new Scanner(System.in);
        
        System.out.println("Welcome to Rock Paper Scissors.");
        
        while (true) {
            System.out.println("Type 1 for Rock, 2 for Paper, 3 for Scissors and 4 to Exit");

            int CompThrow = (int)(Math.random()*3)+1;
            int UserThrow = UserInput.nextInt();

            if (UserThrow == 4) {break;}

            if (CompThrow == UserThrow){
                System.out.println("You Tied.");
            } else if ((CompThrow == 1 && UserThrow == 2) || (CompThrow == 2 && UserThrow == 3) || (CompThrow == 3 && UserThrow == 1)) {
                System.out.println("You Lose...");
            } else if ((CompThrow == 1 && UserThrow == 3) || (CompThrow == 2 && UserThrow == 1) || (CompThrow == 3 && UserThrow == 2)) {
                System.out.println("You Win!!");
            } else {
                System.out.println("Error Try Again");
            }
        }
        UserInput.close();
    }
}