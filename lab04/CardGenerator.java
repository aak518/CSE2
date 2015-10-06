// Anas Kamal
// lab04
// Card Generator program
// This Program will 
// 1. generate a random number from 1 to 52
// 2. get the name and suit of the card based on the number
// 3. print out the card suit and name

import java.util.Scanner;
public class CardGenerator{
    public static void main(String[] args) {
        
        String cardtype= ""; // set up variable as string
        String switchnum= ""; // set up variable as string
       
        int num = (int)(Math.random()*(52+1))+1; // random number generator
        int realnum = 0; // set up variable as int
        
        
        if (num >=40 && num <=52) { // if number is between 40 and 52, then subtract 39 and make it spades
            cardtype = "Spades";
            realnum = num-39;
        }
        else if (num >=27 && num <=39) { // if number is between 27 and 39, then subtract 26 and make it hearts
            cardtype = "Hearts";
            realnum = num-26;
        }
        else if (num >=14 && num <=26) { // if number is between 14 and 26, then subtract 13 and make it clubs
            cardtype = "Clubs";
            realnum = num-13;
        }
        else { // else, then make it diamonds and the number as is
            cardtype = "Diamonds"; 
            realnum = num;
        }
        
        switch (realnum) { 
            case 13:
                switchnum = "King"; // if the number is 13 make it say king
                break;
            case 12:
                switchnum = "Queen"; // if the number is 12 make it say queen
                break;
            case 11:
                switchnum = "Jack"; // if the number is 11 make it say jack
                break;
            case 1:
                switchnum = "Ace"; // if the number is 1 make it say ace
                break;
        }
        if (realnum ==1 || realnum >10){
            System.out.println("You picked the "+switchnum+" of "+cardtype); // print the card type and the number, or in that case, king, queen, jack, ace.
        }
        else {
            System.out.println("You picked the "+realnum+" of "+cardtype); // print the card type and the number.
        }
    }
}