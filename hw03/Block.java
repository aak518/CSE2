// Anas Kamal
// hw 03
// Block java program
// This program will
// 1. ask for the height length and width of the block
// 2. will calculate the volume and surface area of the block 
// 3. print out the results

import java.util.Scanner; // create scanner

public class Block{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // set up scanner
        
        System.out.print("Enter the height of the Block "); // ask for user input for height
        double H = myScanner.nextDouble(); // make response a double
        
        System.out.print("Enter the length of the Block "); // ask for user input for length
        double L = myScanner.nextDouble();  // make the response a double
        
        System.out.print("Enter the width of the Block "); // ask for user input for width
        double W = myScanner.nextDouble(); // make the response a double
        // all inputs have been gathered
        
        // calculate and print outputs
        
        double V = H*L*W; // volume equals the product of all the sides
        double SA = 2*(H*L+H*W+L*W); // surface area equation
        System.out.println("The volume of the block of dimentions "+H+" X "+L+" X "+W+" is "+V+"."+" The surface area of the block is "+SA); //print out the results
    }
}