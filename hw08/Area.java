// Anas Kamal
// hw 08
// Shapes
// this program will
// 1. ask user for either rectangle, triangle, or circle
// 2. then ask user for dimensions of the chosen shape
// 3. calculate area and print it out

import java.util.Scanner;
public class Area{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String rectangle="rectangle";
        String triangle="triangle";
        String circle="circle";
        
        System.out.print("Enter the shape you want the area for: ");
        String shape = myScanner.next();
        
        while(!"rectangle".equals(shape) || !"triangle".equals(shape)){ 
            
            if(shape.equals(circle)){
            System.out.print("enter the radius: ");
            double rad = myScanner.nextDouble();
            System.out.println("The area is: "+rad*rad*Math.PI);
            break;
        }
        else if(shape.equals(rectangle)){
            System.out.print("enter the height:");
            double height1 = myScanner.nextDouble();
            System.out.print("enter the width:");
            double width1 = myScanner.nextDouble();
            System.out.println("The area is: "+height1*width1);
            break;
        }
        else if(shape.equals(triangle)){
            System.out.print("enter the height:");
            double height2 = myScanner.nextDouble();
            System.out.print("enter the width:");
            double width2 = myScanner.nextDouble();
            System.out.println("The area is: "+(height2*width2)/2);
            break;
        }
        else{
            System.out.print("Enter the shape you want the area for: ");
            shape = myScanner.next();
        }
        }
    }
}