// Anas Kamal
// lab 11
// search

import java.util.Scanner;

public class Search{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        int [] array1;
        array1 = new int [50];
        
        int [] array2;
        array2 = new int [50];
        
        for (int i=0; i < array1.length; i++){
            int num = (int)(Math.random()*(100000+1))+0;
            array1[i] = num;
        }
        
        int max1 = array1[0];
        for(int i=0; i < array1.length; i++){
            if(array1[i] > max1){
                max1 = array1[i];
            }
        }
        
        int min1 = array1[0];
        for(int i=0; i < array1.length; i++){
            if(array1[i] < min1){
                min1 = array1[i];
            }
        }
        
        System.out.println("The maximum of array1 is: "+ max1);
        System.out.println("The minimum of array1 is: "+ min1);
    
        for(int i=1; i < array2.length; i++){
            int num2 = (int)(Math.random()*(1000000+1))+0;
            array2[0]= 5;
            array2[i] = num2;
           while(array2[i]<array2[i-1]){
            num2 = (int)(Math.random()*(1000000+1));
            array2[i] = num2;
        }
        }
        int max2 = array2[49];
        int min2 = array2[1];
        System.out.println("The maximum of array2 is: "+ max2);
        System.out.println("The minimum of array2 is: "+ min2);
        
        System.out.print("Enter the number to search for: ");
        int search = myScanner.nextInt();
        while(search<min2 || search > max2){
            System.out.print("Out of bounds, enter again: ");
            search = myScanner.nextInt();
        }
        int upperbound = 50;
        int lowerbound = 0;
        int position = (lowerbound+upperbound)/2; 
        
        while((array2[position] != search)&&(lowerbound <= upperbound)){
            if (array2[position] > search){
                upperbound = position -1;
            }
            else{
                lowerbound = position +1;
            }
            position = (lowerbound +upperbound)/2;
        }
        int numbefore = array2[position];
        int numafter = array2[position+1];
        if (lowerbound <= upperbound){
            System.out.println("The number was found");
            System.out.println("The number before it was: "+numbefore);
            System.out.println("The number after it was: "+numafter);
        }
        else{
            System.out.println("The number was not found");
             System.out.println("The number before it was: "+numbefore);
            System.out.println("The number after it was: "+numafter);
        }
    }
}
        
        
        
        
        
        
        
        
        
        
        
        