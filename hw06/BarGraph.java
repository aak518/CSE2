// Anas Kamal
// hw 06
// Bar Graph
// this program will 
// 1. ask user for input for each day of the week
// 2. print "bar graphs for each day"
// 3. print the average weekly expenses and estimated expenditures for 4 years

import java.util.Scanner; // for the scanner set up

public class BarGraph{
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in); // set up scanner
        
        System.out.print("Expenses for Monday:   $");
        double mon = myScanner.nextDouble();                // ask for monday
        if (mon < 0){
            System.out.println("enter a positive number");
        }
        
        System.out.print("Expenses for tuesday:   $");
        double tue = myScanner.nextDouble();                 // ask for tuesday
        if (tue < 0){
            System.out.println("enter a positive number");
        }
        
        System.out.print("Expenses for wednesday:   $");
        double wed = myScanner.nextDouble();                // ask for wednesday
        if (wed < 0){
            System.out.println("enter a positive number");
        }
        
        System.out.print("Expenses for thursday:   $");
        double thu = myScanner.nextDouble();                // ask for thursday
        if (thu < 0){
            System.out.println("enter a positive number");
        }
        
        System.out.print("Expenses for friday:   $");
        double fri = myScanner.nextDouble();                 // ask for friday
        if (fri < 0){
            System.out.println("enter a positive number");
        }
        
        System.out.print("Expenses for saturday:   $");
        double sat = myScanner.nextDouble();                 // ask for saturday
        if (sat < 0){
            System.out.println("enter a positive number");
        }
        
        System.out.print("Expenses for sunday:   $");
        double sun = myScanner.nextDouble();                 // ask for sunday
        if (sun < 0){
            System.out.println("enter a positive number");
        }
        
        System.out.println("                           ");
        
        System.out.print("Monday:  ");
        for (int i=0; i <= mon-1; i++){
            System.out.print("*");              // printing the bar graph for monday using for loop
        }System.out.println("*");
        
        System.out.print("Tuesday  ");
        for (int i=0; i <= tue-1; i++){
            System.out.print("*");              // printing the bar graph for Tuesday using for loop
        }System.out.println("*");
        
        System.out.print("Wednesday:  ");
        for (int i=0; i <= wed-1; i++){
            System.out.print("*");              // printing the bar graph for Wednesday using for loop
        }System.out.println("*");
        
        System.out.print("Thursday:  ");
        for (int i=0; i <= thu-1; i++){
            System.out.print("*");               // printing the bar graph for Thrusday using for loop
        }System.out.println("*");
        
        System.out.print("Friday:  ");
        for (int i=0; i <= fri-1; i++){
            System.out.print("*");                // printing the bar graph for Friday using for loop
        }System.out.println("*");
        
        System.out.print("Saturday:  ");
        for (int i=0; i <= sat-1; i++){
            System.out.print("*");               // printing the bar graph for Satrday using for loop
        }System.out.println("*");
        
        System.out.print("Sunday:  ");
        for (int i=0; i <= sun-1; i++){
            System.out.print("*");              // printing the bar graph for Sunday using for loop
        }System.out.println("*");
        
        
        double average;
        average = (mon+tue+wed+thu+fri+sat+sun)/7; // calculate weekly average
        System.out.println("             ");
        System.out.printf("Your average weekly expenses are:  $ %4.2f\n",+ average); //print out average
        
        
        int fluc = (int)(Math.random()*(0+20+20))-20; //generate random number from -20 to 20
        double percentage = fluc/100; // make value a percent
        double change = percentage*(average*208); // calculate the change (fluctuation)
        double expenditure = change+(average*208); // add it to the original
        System.out.printf("Estimated expenditure for 4 years:  $ %6.2f\n",+ expenditure); // print out the costs expected for 4 years
    }
}