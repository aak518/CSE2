/* Anas Kamal
lab 06 
Loop program
*/

public class GettingLoopy{
    public static void main(String[] args) {
    System.out.println("Step 1: ");
    int i1 = 1;
    int counter1 = 1;
    String numbers = "";
    
    while (i1 <7){
            numbers = numbers + i1 + "";
            i1++;
        }
        
        System.out.println(numbers+ i1+i1+i1+i1+i1);
        System.out.println("                     ");
        
    int i2 =0;
    int num =0;
   
    String  primeNumbers = "";

    for (i2 = 10; i2 <= 100; i2++){ 		  	  
          int counter2=0; 	  
          for(num =i2; num>=1; num--){
             if(i2%num==0){
 		counter2 = counter2 + 1;
	     }
	  }

    if (counter2 ==2){
	     primeNumbers = primeNumbers + i2 + " ";
	  }	
    }
    
     System.out.println("Step 2: ");
       System.out.println("for loop:" + " " +primeNumbers);

String primeNumbers2 = "";
int i3 = 10;
int num2 = 0;
    while (i2<= 100){
        int counter3=0;
        i2++;
        while (num2 >=1){
            num2--;
            if(i3%num2==0){
              counter3 = counter3 +1;
            }
        }
        if (counter3 ==2){
            primeNumbers2 = primeNumbers2 +1;
        }
    
    }
    System.out.println("while loop:" + " " +primeNumbers);
    
   
  int rand = (int)(Math.random()*(200+5))+5;  
  System.out.println("Step 3: ");
  for (int i = 0; i<=rand; i++){   
      System.out.print(":) ");
  }
}   
}