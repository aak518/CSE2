// Anas Kamal
// hw 03
// Timer java program
// this program will
// 1. ask for the current time
// 2. ask for the dinner time
// 3. calculate the time left until dinner and print it out

import java.util.Scanner; // create scanner

public class Timer{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // set up scanner
        
        System.out.print("Enter the current time "); // ask for user input for current time
        int Time = myScanner.nextInt(); // have the response be an int
        
        System.out.print("Enter the time for dinner "); // ask for user input for dinner time
        int Dinner = myScanner.nextInt(); // have the response be an int
        // all inputs have been gathered
        
        // calculate and print out outputs
        
       int TimeLeft = Dinner-Time; // subtract the times to get the difference
       int Hours, Minutes; // make variables for hours and minutes
       Hours=(int)(TimeLeft/100)%10; // have an int for just the number of hours
       Minutes=(int)TimeLeft%100; // have an int for the minutes remaining
       
       System.out.println("You have "+Hours+" hours and "+Minutes+" minutes until dinner"); // print out the results
    }
}