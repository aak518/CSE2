// Anas Kamal
// lab 12
// Array Manipulation

import java.util.Scanner;

public class ArrayManipulation{
    public static void main(String[] args){
        raggedArray();
    }
        
        
        
        public static void raggedArray(){
        int randnum = (int)(Math.random()*(20-10))+10;
        int [][] array1 = new int [randnum][];
        
        for (int i=0; i <array1.length; i++){
            int randnum2 = (int)(Math.random()*(20-10))+10;
            array1[i] = new int[randnum2];

            for(int j=0; j<randnum2; j++){
                int randnum3 = (int)(Math.random()*(0+1000+1000))-1000;
                array1 [i][j] = randnum3;
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
            
        }
        return array1;
    }
}