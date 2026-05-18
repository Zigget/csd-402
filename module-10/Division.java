/*
Made by: Samuel Sidzyik
Module 10.2
Start Date May 16, 2026

Work on abstraction

https://github.com/Zigget/csd-402/blob/main/module-10/
*/
public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Constructor requires both fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}
