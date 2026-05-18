/*
Made by: Samuel Sidzyik
Module 10.2
Start Date May 16, 2026

Work on abstraction

https://github.com/Zigget/csd-402/blob/main/module-10/
*/
public class DomesticDivision extends Division{
    // the IDE caught that I can mark these variables as Final. This wasn't my expertise. I do understand why it says that.
    private final String state;

    // Constructor requires all fields
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // This is the method overwritten as mentioned in division class
    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}