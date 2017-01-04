package unit7;
import java.io.*;
import java.util.*;
public class BestActress
{
   public static void main(String[]args) throws FileNotFoundException
   {
      Scanner keyboard = new Scanner(new File("BestActress.txt"));
   
      PrintStream output = new PrintStream(new File("test.txt"));
      String line = "";
      int counter=1;
      while (keyboard.hasNextLine())
      {
         line = keyboard.nextLine();
         if (counter%2==1)
         {
            output.println(line);
         }
         counter++;
      }
   
      Scanner keyboard2 = new Scanner(new File("BestActress.txt"));
      PrintStream output2 = new PrintStream(new File("test2.txt"));
      String line2="";
      int counter2=1;
      int length = 0;
      char character=' ';
      int a = 0;
      while (keyboard2.hasNextLine())
      {
         line2 = keyboard2.nextLine();
         length = line2.length();
         if (counter2%2==1)
         {
            for (a=0; a<length; a++)
            {
               character=line2.charAt(a);
               if (Character.isDigit(character))
               {
                  output2.print(character);
               }
            }
         }
         else if (counter2%2==0)
         {
            output2.print(" ");
            output2.println(line2);
         }
         else
         {
            output2.println("");
         }
         counter2++;
      }
   }
}