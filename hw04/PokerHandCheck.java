// Anas Kamal
// hw04
// poker hand Check
// This prgram will
// 1.generate 5 different random cards
// 2. test to see if there are two of the same type (pair), two pairs, three of a kind, or a high (no matches)
// 3. print out the 5 cards and which of the four possibilities above happened

import java.util.Scanner;
public class PokerHandCheck{
    public static void main(String[] args) {
        
        String cardtype= ""; // set up variable as string
         String switchnum= ""; // set up variable as string
       
        int num1 = (int)(Math.random()*(52+1))+1; // random number generator
        int realnum1 = 0; // set up variable as int
        
        
        if (num1 >=40 && num1 <=52) { // if number is between 40 and 52, then subtract 39 and make it spades
            cardtype = "Spades";
            realnum1 = num1-39;
        }
        else if (num1 >=27 && num1 <=39) { // if number is between 27 and 39, then subtract 26 and make it hearts
            cardtype = "Hearts";
            realnum1 = num1-26;
        }
        else if (num1 >=14 && num1 <=26) { // if number is between 14 and 26, then subtract 13 and make it clubs
            cardtype = "Clubs";
            realnum1 = num1-13;
        }
        else { // else, then make it diamonds and the number as is
            cardtype = "Diamonds"; 
            realnum1 = num1;
        }
        
        
        
     int num2 = (int)(Math.random()*(52+1))+1; // random number generator
        int realnum2 = 0; // set up variable as int
        
        
        if (num2 >=40 && num2 <=52) { // if number is between 40 and 52, then subtract 39 and make it spades
            cardtype = "Spades";
            realnum2 = num2-39;
        }
        else if (num2 >=27 && num2 <=39) { // if number is between 27 and 39, then subtract 26 and make it hearts
            cardtype = "Hearts";
            realnum2 = num2-26;
        }
        else if (num2 >=14 && num2 <=26) { // if number is between 14 and 26, then subtract 13 and make it clubs
            cardtype = "Clubs";
            realnum2 = num2-13;
        }
        else { // else, then make it diamonds and the number as is
            cardtype = "Diamonds"; 
            realnum2 = num2;
        }
        
        
         int num3 = (int)(Math.random()*(52+1))+1; // random number generator
        int realnum3 = 0; // set up variable as int
        
        
        if (num3 >=40 && num3 <=52) { // if number is between 40 and 52, then subtract 39 and make it spades
            cardtype = "Spades";
            realnum3 = num3-39;
        }
        else if (num3 >=27 && num3 <=39) { // if number is between 27 and 39, then subtract 26 and make it hearts
            cardtype = "Hearts";
            realnum3 = num3-26;
        }
        else if (num3 >=14 && num3 <=26) { // if number is between 14 and 26, then subtract 13 and make it clubs
            cardtype = "Clubs";
            realnum3 = num3-13;
        }
        else { // else, then make it diamonds and the number as is
            cardtype = "Diamonds"; 
            realnum3 = num3;
        }
        
        
         int num4 = (int)(Math.random()*(52+1))+1; // random number generator
        int realnum4 = 0; // set up variable as int
        
        
        if (num4 >=40 && num4 <=52) { // if number is between 40 and 52, then subtract 39 and make it spades
            cardtype = "Spades";
            realnum4 = num4-39;
        }
        else if (num4 >=27 && num4 <=39) { // if number is between 27 and 39, then subtract 26 and make it hearts
            cardtype = "Hearts";
            realnum4 = num4-26;
        }
        else if (num4 >=14 && num4 <=26) { // if number is between 14 and 26, then subtract 13 and make it clubs
            cardtype = "Clubs";
            realnum4 = num4-13;
        }
        else { // else, then make it diamonds and the number as is
            cardtype = "Diamonds"; 
            realnum4 = num4;
        }
        
        
         int num5 = (int)(Math.random()*(52+1))+1; // random number generator
        int realnum5 = 0; // set up variable as int
        
        
        if (num5 >=40 && num5 <=52) { // if number is between 40 and 52, then subtract 39 and make it spades
            cardtype = "Spades";
            realnum5 = num5-39;
        }
        else if (num5 >=27 && num5 <=39) { // if number is between 27 and 39, then subtract 26 and make it hearts
            cardtype = "Hearts";
            realnum5 = num5-26;
        }
        else if (num5 >=14 && num5 <=26) { // if number is between 14 and 26, then subtract 13 and make it clubs
            cardtype = "Clubs";
            realnum5 = num5-13;
        }
        else { // else, then make it diamonds and the number as is
            cardtype = "Diamonds"; 
            realnum5 = num5;
        }
        
        
        
        
        
        
        switch (realnum1) { 
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
        if (realnum1 ==1 || realnum1 >10){
            System.out.println("You picked the "+switchnum+" of "+cardtype); // print the card type and the number, or in that case, king, queen, jack, ace.
        }
        else {
            System.out.println("You picked the "+realnum1+" of "+cardtype); // print the card type and the number.
        }
        
        
        switch (realnum2) { 
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
        if (realnum2 ==1 || realnum2 >10){
            System.out.println("You picked the "+switchnum+" of "+cardtype); // print the card type and the number, or in that case, king, queen, jack, ace.
        }
        else {
            System.out.println("You picked the "+realnum2+" of "+cardtype); // print the card type and the number.
        }
        
        
        switch (realnum3) { 
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
        if (realnum3 ==1 || realnum3 >10){
            System.out.println("You picked the "+switchnum+" of "+cardtype); // print the card type and the number, or in that case, king, queen, jack, ace.
        }
        else {
            System.out.println("You picked the "+realnum3+" of "+cardtype); // print the card type and the number.
        }
        
        
        switch (realnum4) { 
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
        if (realnum4 ==1 || realnum4 >10){
            System.out.println("You picked the "+switchnum+" of "+cardtype); // print the card type and the number, or in that case, king, queen, jack, ace.
        }
        else {
            System.out.println("You picked the "+realnum4+" of "+cardtype); // print the card type and the number.
        }
        
        
        switch (realnum5) { 
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
        if (realnum5 ==1 || realnum5 >10){
            System.out.println("You picked the "+switchnum+" of "+cardtype); // print the card type and the number, or in that case, king, queen, jack, ace.
        }
        else {
            System.out.println("You picked the "+realnum5+" of "+cardtype); // print the card type and the number.
        }
    if (realnum1 == realnum2 || realnum1 == realnum3 || realnum1 == realnum4 || realnum1 == realnum5 
    || realnum2 == realnum3 || realnum2 == realnum4 || realnum2 == realnum5 
    || realnum3 == realnum4 || realnum3 == realnum5 || realnum4 ==realnum5) {
        System.out.println("You have picked at least 1  pair!"); // sees if at least one pair is acheived and prints
    }
    else if ((realnum1 == realnum2) && (realnum1 == realnum3) || (realnum1 == realnum2) && (realnum1 == realnum4) || (realnum1 == realnum2) && (realnum1 == realnum5) || (realnum1 == realnum4) && (realnum1 == realnum3) || (realnum1 == realnum5) && (realnum1 == realnum3) || (realnum1 == realnum4) && (realnum1 == realnum5)
    || (realnum2 == realnum3) && (realnum2 == realnum4) || (realnum2 == realnum3) && (realnum2 == realnum5) || (realnum2 == realnum5) && (realnum2 == realnum4)
    (realnum3 == realnum4) && (realnum3 == realnum5)) {
        System.out.println("You have picked a three of a kind!"); // sees if a three of a kind is acheived and prints
    }
    else {
        System.out.println("You have a high card hand!"); // if nothing special is acheived this will print
    }
    }
}