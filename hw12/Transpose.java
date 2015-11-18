// Anas Kamal
// HW 12 Transpose
// This program will
// 1. ask the user for width and height
// 2. fill out a matrix of given dimensions with random integers between -10 and 10
// 3. check if the program is rectangular, which it should be
// 4. transpose the matrix

import java.util.Scanner;

public class Transpose{
    public static void main(String[] args){
        randomMatrix();
       
    }
        
        public static void randomMatrix(){
            Scanner myScanner = new Scanner(System.in);
            
            System.out.print("Enter the height: ");
            int height = myScanner.nextInt();
            while (height<1){
                System.out.print("Enter the height: ");
                height = myScanner.nextInt();
            }
            System.out.print("Enter the width: ");
            int width = myScanner.nextInt();
            while(width<1){
                System.out.print("Enter the width: ");
                width = myScanner.nextInt();
            }
            
            
            int [][] array1 = new int[width][];
            
            for(int i=0; i<array1.length; i++){
                array1[i] = new int[height];
                
                for(int j=0; j<height; j++){
                    int random = (int)(Math.random()*(0+10+10))-10;
                    array1 [i][j] = random;
                    System.out.print(array1[i][j] + " ");
                }
                System.out.println();
            }
        
        System.out.println("");
        
       
            int [][] temp = new int[array1[0].length][array1.length];
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[0].length; j++){
                temp[j][i] = array1[i][j];
                System.out.print(temp[i][j] + " ");
            }
            System.out.println("");
        }
        }
}