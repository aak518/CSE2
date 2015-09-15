package Test;
import java.util.Scanner;
 
public class Test {
 
  
    public static void main(String[] args) {
        // Create scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        int Number; //User input number
 
        System.out.print( "Enter Five Digit Integer:");//Prompt
        Number = input.nextInt(5);//read integer from user
 
        int Remainder4 = Number % 10000;
         
        int Remainder3 = Remainder4 % 1000;
 
        int Remainder2 = Remainder3 % 100;
 
        int Remainder1 = Remainder2 % 10;
 
        int Remainder0 = Remainder1 / 1;
    }
}