import java.util.Random;
import java.util.Scanner;

public class NameList {
	public static void main(String[] args) {
		//declare the random number 
		Random rand = new Random();
		
		//asign a scanner 
		Scanner scan = new Scanner(System.in);
		
		//asign the names to the names array 
		String[] names = new String[]{"Hermione","Harry","Ron","Dumbledore","Snape"};
		
		//print the last element of names array 
		System.out.println(names[(names.length-1)]+" is the last name in the array");
		
		//print the names backword
		for (int i = (names.length-1); i>=0;i--){
			//print the name
			System.out.print(names[i]+" ");
			//print the amount of charactors used 
			System.out.println(names[i].length());
		}
		
		//make the second array 
		String[] names2 = new String[]{names[0],names[1],names[2],names[3],names[4],"Dolores","Gilderoy","Nymphadora","Molly","Mad-Eye"};
	
		//print a name at random
		System.out.println(" ");
		System.out.println(names2[(rand.nextInt(9) + 1)]+" is the random name selected");
		System.out.println(" ");
		
		
		//print the second array in a list 
		for (int i = 0; i<(names2.length);i++){
			//print the name
			System.out.print((i+1)+") "+names2[i]+" ");
			//print the amount of characters used 
			System.out.println(names2[i].length());
		}
		//call the find avg class
		System.out.println("the avarge lenth of the names are "+findavg(names2));
		
	
		
		
		
		
		
	}
public static int findavg(String[] names) {
			int sum = 0;
			int avg = 0;
			for (int i = 0;i<names.length;i++){
				sum = sum+(names[i].length());
			}
			avg= sum/names.length;
			return avg;

}
}
