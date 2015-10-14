// Anas Kamal
// hw 07 Twisty
// this program will
// 1. ask for width and lenght of drawing
// 2. draw double helix of slashes and "#"s
 
import java.util.Scanner; // set up scanner

public class Twisty{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // set up scanner 
        
        System.out.print("enter the length: "); // ask for user input
        int length = myScanner.nextInt();
        
        System.out.print("enter the width: "); // ask for user input
        int width = myScanner.nextInt();
        
        for(int i =1; i<width+1; i++){ // outer loop
            for(int j=1; j<length+1; j++){ //inner loop
                if(j==i || j==(length-i)){
                    System.out.print("#");
                }
                else if((length-j)==(width-j)) {
                    System.out.print("/");
                }
            }
            System.out.println(""); 
        }
    }
}