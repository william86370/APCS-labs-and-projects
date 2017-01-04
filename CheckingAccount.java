import java.util.Scanner;

public class CheckingAccount{ 
  private double myBalance; 
   private int myAccountNumber; 
Scanner scan = new Scanner(System.in);
   public CheckingAccount(){ 
     myBalance = 0.0; 
     myAccountNumber = 0; 
   } 
   public CheckingAccount(double initialBalance, int acctNum){ 
	   if(initialBalance<0){
		   throw new IllegalArgumentException("Error: score is negative.");
		  
	   }else{
		   myBalance = initialBalance; 
      myAccountNumber = acctNum;  
	   }
     
   } 

   public double getBalance(){ 
   return myBalance; 
   } 

   public void deposit(double amount){ 
     myBalance += amount; 
   } 
   public void withdraw(double amount){ 
      myBalance -= amount; 
   } 
} 

