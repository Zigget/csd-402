/*
Made by: Samuel Sidzyik
Module 10.2
Start Date May 16, 2026

Work on abstraction

https://github.com/Zigget/csd-402/blob/main/module-10/
*/
public class InternationalDivision extends Division {
    // the IDE caught that I can mark these variables as Final. This wasn't my expertise. I do understand why it says that.
    private final String country;
    private final String language;

    // Constructor requires all fields
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // This is the method overwritten as mentioned in division class
    @Override
    public void display() {
        System.out.println("International Division:");
        System.out.println("Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country Located: " + country);
        System.out.println("Language Spoken: " + language);
        System.out.println();
    }
}
