/*
Made by: Samuel Sidzyik
Module 7.2
Start Date April 26, 2026

Array of fans and accessed using 'this'

https://github.com/Zigget/csd-402/blob/main/module-7/Sidzyik_Module_7_2.java
*/

import java.util.ArrayList;

class Fan {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "Indigo";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //Getters
    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    // Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius =radius;
    }

    public void setColor(String color) {
        this.color =color;
    }
}

public class Sidzyik_Module_7_2 {

    // Method to display one Fan object
    public static void displayFan(Fan fan) {
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor()+ "\n");
    }

    // Method to display collection of Fans
    public static void displayFans(ArrayList<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);

        }
    }

    public static void main(String[] args) {

        // Create collection of Fan objects
        ArrayList<Fan> fans = new ArrayList<>();

        fans.add(new Fan());
        fans.add(new Fan(Fan.SLOW, true, 7, "red"));
        fans.add(new Fan(Fan.MEDIUM, false, 8, "green"));
        fans.add(new Fan(Fan.FAST, true, 9, "blue"));

        // Display all fans
        displayFans(fans);
    }
}