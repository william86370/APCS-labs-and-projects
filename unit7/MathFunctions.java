package unit7;
import java.util.*;
    class MathFunctions{
    	public static int count=1;
    	public static int number=1;
       public static void main(String[] args) {
         int n=0; char answer;
         Scanner input = new Scanner(System.in);
         do{
            System.out.println("Enter a letter for the following menu.");
            System.out.println("A. Factorial");
            System.out.println("B. Fiboncci");
            System.out.println("C. Triangular");
            System.out.println("Q. Quit");
            answer = input.next().charAt(0);
            if(answer != 'Q'){
               System.out.print("enter your number. ");
               n = input.nextInt();
            }
            switch(answer){
               case 'A':
               case 'a': System.out.println( "The factorial of " + n + " is " 
                     + factorial(n) + "." );  
                  break;
               case 'B':
               case 'b': System.out.println( "The " + n + "th Fibonacci number  is " 
                     + fibonacci(n) +"."); 
                  break;
              case 'C':
               case 'c': System.out.println("The " + n +"th triangular number is " 
                     + triangularNumber(n) + "." ); 
                  break;
            }
         }while(answer != 'Q');
      } //Do not change the main method!!!
      
       static int factorial(int n) {
    	   if (n <= 1)
    	      return 1;
    	   else
    	      return (n * factorial(n-1));
    	}
       public static int fibonacci(int n)
      {
		return n;
    	   
      }
       public static int n2;
       public static int triangularNumber(int n)
      {
	
		if(count==1){
			n2=n;
			number = 1;
		}
		if (count==n2){
			return number;
		}else{
			count++;
			
			triangularNumber(number+=count);
		}
		count = 1;
		
		return number;
		
		
		
      }
   
  }
