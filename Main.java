import java.util.*;


class Main {
  public static void main(String[] args) {


     System.out.println("*********************************************************");
     System.out.println("*                TIP CALCULATOR                         *");
     System.out.println("*********************************************************");
System.out.println("Enter the Bill amount:");
  Scanner input = new Scanner(System.in);
   double Bill = input.nextDouble();
System.out.println("Enter the tip percentage");
    int tip = input.nextInt();
  System.out.println("Enter the number of people");
    int number = input.nextInt();
  System.out.println("************************************************************");
  System.out.println("Total tip amount is : $" + (Bill * tip) / 100); 
    System.out.println("Bill amount for per person is: $" + (Bill / number ));
    System.out.println("Tip amount for per person is: $" + (number *  tip) / 100 );
    
     //Write your code here
      
    
    
    
  }
}