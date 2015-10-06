// Anas Kamal
// hw06
// Check digit program
// this program will
// 1. check the first 9 digits and multiply them by 10 to 2 respectively
// 2. then mod 11 the result and if it equals the last digit then it is a valid isbn

import java.util.Scanner; // set up scanner

public class CheckDigit{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); // scanner set up
    
        String casex=""; // for later usage
        System.out.print("Please enter a 10 digit barcode  "); // gather user input
        int isbn = myScanner.nextInt();
     if (isbn < 1000000000) { // make sure number is valid
        System.out.println("please enter 10 digits");
    }
        int num9 = isbn /1000000000 %10;    
        int num8 = isbn /100000000 %10;
        int num7 = isbn /10000000 %10;
        int num6 = isbn /1000000 %10;
        int num5 = isbn /100000 %10;                // make an int for each digit
        int num4 = isbn /10000 %10;
        int num3 = isbn /1000 %10;
        int num2 = isbn /100 %10;
        int num1 = isbn /10 %10;
        int checknum = isbn %10;
        
        int sum = (num9*10)+(num8*9)+(num7*8)+(num6*7)+(num5*6)+(num4*5)+(num3*4)+(num2*3)+(num1*2); // the sum of first 9 digits
        
        int correctnum = sum%11; // correct check digit
        
        switch (correctnum){
            case 10:
                casex= "X"; // replace 10 with x
                break;
        }
        
        if (correctnum == checknum){
            System.out.println("The isbn is valid");    // print this out if number is valid
        }
        else if (correctnum==10){
            System.out.println("The check digit should be "+casex);   // print this out with x if check digit has to be 10
        }
        else{
            System.out.println("The check digit should be "+correctnum); // print this out if the check digit is not 10
        }
    }
}