// Anas Kamal
// homework 10
// shuffling
// This program will:
// 1. print 52 cards in order
// 2. shuffle the cards and print them out shuffled 
// 3. pick out 5 random cards and prints them out

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;          // for set up purposes
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
 

public class Shuffling{
   public static void shuffle(String[] cards){      // shuffle method
       List list = new ArrayList();
        Collections.shuffle(list);
        Collections.shuffle(Arrays.asList(cards));     // shuffles cards as list
        System.out.println("Shuffled: ");
        for (int i=0; i<52; i++){
            System.out.print(cards[i]+" ");         // prints out shuffled cards
        }
   }
   
   public static void hand(String[] cards){       // hand method 
       System.out.println("Randomized hand: ");
       for(int j = 0; j<5; j++){
       int rand = new Random().nextInt(cards.length);      // randomizes 
       String Random = (cards[rand]);                      // adds to string array
       System.out.print(Random+" ");                        // prints the picked hand
        }
}

    public static void main(String[] args){       // main method
        Scanner scan = new Scanner(System.in);
        String[] suitNames = {"C","H","S","D"};
        String[] rankNames = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] cards = new String[52];
        String[] hand = new String[5];
        for (int i=0; i<52; i++){
            cards[i] = rankNames[i%13]+suitNames[i/13];
            System.out.print(cards[i]+" ");
        }
        System.out.println("");
        shuffle(cards);                // calls the shuffle method
        System.out.println("");
        hand(cards);                  // calls the hand method
        
    }
}