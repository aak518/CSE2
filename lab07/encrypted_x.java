// Anas Kamal
// Lab 07
// this program will
// 1. ask for input from 0 to 100
// 2. print an encrypted x with dimensions given

import java.util.Scanner; // set up scanner

public class encrypted_x{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // set up scanner
        
        System.out.print("Enter the dimension for the X (between 0 and 100): "); // ask for user input
        int dim = myScanner.nextInt();
        while (dim<0 || dim>100){ 
            System.out.println("Please enter a number between 0 and 100");// if number is out of range send this message
            System.out.print("Enter the dimension for the X (between 0 and 100): "); // ask for user input if first time is out of range
         dim = myScanner.nextInt();
        }
        
        for(int i =1; i<dim+1; i++){ // outer loop is for the rows
            for(int j =1; j<dim+1; j++){
                if (j==i || j == (dim-i)){ // inner loop is for the columns
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println(""); // just to move to next line
        }
    }
}
