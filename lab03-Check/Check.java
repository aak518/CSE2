// Anas Kamal
// lab 03 
// Check Java Program
// This program will 
// 1. ask for the cost of the check, the percentage tip, and the number of ways the check will be split
// 2. print how much each person will pay

import java.util.Scanner; // create Scanner

public class Check{ 
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);  // set up scanner
        
        System.out.print("Enter the original cost of the check in the form xx.xx: "); // ask for user input of cost of original cost
        double checkCost = myScanner.nextDouble();  // make the response a double 
        
        System.out.print("Enter the percentage tip that you wish to pay as a whole number in the form xx: "); // ask for user input of the tip
        double tipPercent = myScanner.nextDouble(); // make the response a double
        tipPercent /= 100; // turn the response for tip a percentage
        
        System.out.print("Enter the number of people who are willing to pay: "); // ask for user input of the number of people who are paying
        int People = myScanner.nextInt(); // make the response an int because it has to be a whole number
        
        // now, all the input needed has been taken
        // print out outputs
        double totalCost; // make a variable for the total cost
        double costPerPerson; // make a variable for the cost for each person
        int dollars, dimes, pennies;  // make int variables for dollars, dimes, and pennies corrosponding to ones, tenths, and hundredths
        
        totalCost = checkCost*(1+tipPercent); // make the total cost equal to the check cost plus the tip
        costPerPerson = totalCost/People; // divde the complete cost over the number of people to know how much each person will pay
        dollars=(int)costPerPerson; // make the dollar amount an int of the cost each person will pay
        dimes=(int)(costPerPerson*10)%10; // give dimes amount that is an int
        pennies=(int)(costPerPerson*100)%10; // give pennies amount that is an int
        
        System.out.println("Each person in the group will pay $"+ dollars + '.'+ dimes + pennies); // print out how much each person has to pay
        
    }
}