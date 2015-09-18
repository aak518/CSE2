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
        
        String cardtype= "";
       
        int num = (int)(Math.random()*(52+1))+1;
        int realnum = 0;
        
        String switchnum= "";
        
        if (num >=40 && num <=52) {
            cardtype = "Spades";
            realnum = num-39;
        }
        else if (num >=27 && num <=39) {
            cardtype = "Hearts";
            realnum = num-26;
        }
        else if (num >=14 && num <=26) {
            cardtype = "Clubs";
            realnum = num-13;
        }
        else {
            cardtype = "Diamonds"; 
            realnum = num;
        }
        System.out.println(realnum);
        
        switch (realnum) {
            case 13:
                switchnum = "King";
                break;
            case 12:
                switchnum = "Queen";
                break;
            case 11:
                switchnum = "Jack";
                break;
            case 1:
                switchnum = "Ace";
                break;
        }
        if (realnum ==1 || realnum >10){
            System.out.println("You picked the "+switchnum+" of "+cardtype);
        }
        else {
            System.out.println("You picked the "+realnum+" of "+cardtype);
        }
    }
}