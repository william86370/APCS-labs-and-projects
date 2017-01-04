package unit7;
import java.util.*;
public class free {
	
	int unknown = (int)(Math.random() * 100000);
	int[] intarray;
	ArrayList<Integer> intAlist = new ArrayList<>();
	public static void main(String[] args) {
		

	}
	public int sum(){
		int sum=0;
		for(int i =0;i<intarray.length;i++){
			sum+=intarray[i];
		}
		return sum;
		
	}

}
