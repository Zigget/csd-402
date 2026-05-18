/*
Made by: Samuel Sidzyik
Module 10.2
Start Date May 16-17, 2026

Work on abstraction - creates classes that extend and overwrite abstract class

https://github.com/Zigget/csd-402/blob/main/module-10/
*/
public class UseDivision{
    public static void main(String[] args) {

    try {
            // Two InternationalDivision objects
        InternationalDivision intl1 = new InternationalDivision("Global Tech", 1001, "Japan", "Japanese");
        InternationalDivision intl2 = new InternationalDivision("Euro Systems", 1002, "Germany", "German");

        // Two DomesticDivision objects
        DomesticDivision dom1 = new DomesticDivision("Midwest Operations", 2001, "Nebraska");
        DomesticDivision dom2 = new DomesticDivision("West Coast Services", 2002, "California");

        // Display all four
        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();

        } catch (IllegalArgumentException e) {
            System.out.println("Error creating division: " + e.getMessage());
        }
    }
}
