package unit7;
import java.io.*;
import java.util.*;
 public class CountCharacters {
   public static void main(String[] args)throws FileNotFoundException {
     Scanner input = new Scanner(System.in);
     System.out.println("What is the name of your file. ");
     String name = input.nextLine();
     Scanner reader = new Scanner(new File(name));// Open text file
     int count = 0;
     char ch;
     while (reader.hasNextLine()) {
        String line = reader.nextLine();// Gets a line while there is one
        System.out.println(line);
        for (int j = 0; j<line.length();j++){
           ch = line.charAt(j);      // Gets the characters on each line
           count++;             // counts the characters
        }
     }
     System.out.println();
     System.out.println("total characters = " + count);
  }
}
