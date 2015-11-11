// Anas Kamal
// hw 11
// cse2 linear
// this program will:
// 1. ask user to put 15 ints that are increasing
// 2. scramble the array and print it
// 3. use linear search to find a number that the user inputs and print out number of iterations it took

import java.util.Scanner;

import java.util.Random;

public class CSE2Linear{
    
    
    public static void sort(int[] scores){
         for (int i = 0; i < scores.length; i++) {
        for (int j = i + 1; j < scores.length; j++) {
            int temp = 0;
            if (scores[i] > scores[j]) {
                temp = scores[i];
                scores[i] = scores[j];
                scores[j] = temp;
            }
        }
        System.out.print(scores[i]+" ");
    }
    }
    
    public static void findlinear(int[] scores){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the score you want to find: ");
        int find = myScanner.nextInt();
        for(int i=0; i<15; i++){
            if (scores[i] == find){
                System.out.println("The score was found with "+ i+1 +" iterations");
            break;
            }
        //else{
            //System.out.println("the score was not found with"+ 15 + "iterations");
        //}
    }
    }
    
    
    
    public static void shuffle(int[] scores){      // shuffle method
       int index;
       int temp;
    Random random = new Random();
    for (int i = scores.length - 1; i > 0; i--){
        index = random.nextInt(i + 1);
        temp = scores[index];
        scores[index] = scores[i];
        scores[i] = temp;
        System.out.print(scores[i]+" ");
    }
}
    
    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        int [] scores;
        scores = new int [15];
        
        System.out.println("Enter the scores: ");
        scores[0]= myScanner.nextInt();
        for (int i=1; i <scores.length; i++){
            scores[i] = myScanner.nextInt(); 
        }
        System.out.print(scores);
        System.out.println("Sorted: ");
        System.out.print(" ");
        sort(scores);
        System.out.println("");
        findlinear(scores);
        System.out.println("Shuffled: ");
        shuffle(scores);
        System.out.println("");
        findlinear(scores);
    }
}