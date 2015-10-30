// Anas Kamal
// lab 10
// introduction to arrays

import java.util.Scanner;

public class Arrays{
    public static void main(String[] args){
        int num = (int)(Math.random()*(5+1))+5;
        String [] students;
        students = new String [num];
        
       int [] midterm;
       midterm = new int [num];
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("enter the names of the " + num + " students:");
        for (int i =0; i < students.length; i++) {
            students[i] = myScanner.next();
            int num2 = (int)(Math.random()*(100+1))+0;
            midterm[i] = num2;
        }
        System.out.println("here are the midterm grads of the " + num + " students above: ");
        
        for (int i=0; i < students.length; i++) {
            int num2 = (int)(Math.random()*(100+1))+0;
            System.out.println(students[i] + ":" + num2);
        }
    }
}
        
        