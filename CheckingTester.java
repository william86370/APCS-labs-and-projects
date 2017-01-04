import java.util.Scanner;
class CheckingTester{ 
	
   public static void main(String[] args){ 
	   Scanner scan = new Scanner(System.in);
	   
	   
     
      double INTEREST_RATE = 2.5; 
      double interest; 
      interest = checking.getBalance() * INTEREST_RATE / 100; 
      checking.deposit(interest); 
      System.out.println("Balance after year 1 is $" + checking.getBalance()); 
      interest = checking.getBalance() * INTEREST_RATE / 100; 
      checking.deposit(interest); 
      System.out.println("Balance after year 2 is $" + checking.getBalance()); 
   } 
} 
