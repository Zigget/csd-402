/*
Made by: Samuel Sidzyik
Module 6.2
Start Date April 19, 2026

Returning arrays for largest and smallest values

https://github.com/Zigget/csd-402/blob/main/module-6/Sidzyik_Module_6_2.java
*/
public class Sidzyik_Module_6_2 {
        // Fan class
    public static class Fan {

        // Speed constants
        public static final int STOPPED = 0;
        public static final int SLOW = 1;
        public static final int MEDIUM = 2;
        public static final int FAST = 3;

        // Fan attributes
        private int speed;
        private double radius;
        private String color;

        // Default
        public Fan() {
            speed = STOPPED;
            radius = 6;
            color = "white";
        }

        // Fan with Values. Not to be confused with Family Values...
        public Fan(int speed, double radius, String color) {
            this.speed = speed;
            this.radius = radius;
            this.color = color.toLowerCase();
        }

        // Check if fan is on
        private boolean on() {
            return speed != STOPPED;
        }

        // Setters and getters
        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getSpeed() {
            return speed;
        }

        public void setFanColor(String color) {
            this.color = color.toLowerCase();
        }

        public String getFanColor() {
            return color;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        // Convert speed to text
        private String speedToString() {
            if (speed == SLOW) return "SLOW";
            if (speed == MEDIUM) return "MEDIUM";
            if (speed == FAST) return "FAST";
            return "STOPPED";
        }

        // Print fan details
        public String toString() {
            String state = on() ? "ON" : "OFF";
            return "The fan is " + state +
                   "\nSpeed: " + speedToString() +
                   "\nRadius: " + radius +
                   "\nColor: " + color;
        }
    }

    // Main method to test the Fan class
    public static void main(String[] args) {

        // Test default fan
        Fan fan1 = new Fan();
        System.out.println("Default Fan:");
        System.out.println(fan1);

        // Test custom fan
        Fan fan2 = new Fan(Fan.SLOW, 8, "Mahogany");
        System.out.println("\nCustom Fan:");
        System.out.println(fan2);

        // Modify custom fan
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setFanColor("Husker Red");
        fan2.setRadius(7);

        System.out.println("\nModified Custom Fan:");
        System.out.println(fan2);
    }
}