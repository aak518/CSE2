// Anas Kamal
// lab 08

import java.util.Scanner; // set up scanner

public class Stats{
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in); // set up scanner
        double mean = 0;
        
        System.out.print("Enter the first number: "); // ask for first number 
        double num1 = myScanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = myScanner.nextDouble();      // ask for second number and check if incresing
        
        while(num2<num1){
            System.out.println("Make the numbers increasing");
            System.out.print("Enter the second number: ");   // if necessary try again
            num2 = myScanner.nextDouble();
        }
        
        System.out.print("Enter the third number: ");
        double num3 = myScanner.nextDouble();           // ask for third number and check if increasing
        
        while(num3<num2){
            System.out.println("Make the numbers increasing");
            System.out.print("Enter the third number: ");     // if necessary try again
            num3 = myScanner.nextDouble();
        }
        
        System.out.print("Enter the fourth number: ");
        double num4 = myScanner.nextDouble();         // ask for fourth number and check if increasing
        
        while(num4<num3){
            System.out.println("Make the numbers increasing");
            System.out.print("Enter the fourth number: ");     // if necessary try again
            num4 = myScanner.nextDouble();
        }
        
        System.out.print("Enter the fifth number: ");
        double num5 = myScanner.nextDouble();       // ask for fifth number and check if increasing
        
        while(num5<num4){
            System.out.println("Make the numbers increasing");
            System.out.print("Enter the fifth number: ");      // if necessary try again
            num5 = myScanner.nextDouble();
        }
            mean = (num1+num2+num3+num4+num5)/5; // calculate mean
            
            System.out.printf("the mean of the numbers is %4.2f\n",+mean);  // print mean 
            System.out.println("the median is "+ num3); // print median
    }
}