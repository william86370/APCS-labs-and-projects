import java.util.Random;

public class ArrayCalculations {
	//all edits where made from william wright ©A.R.C software
	//declare the main method here 
	public static void main(String[] args) {
	    //here is the random generater named randomgenerator
		Random randomGenerator = new Random();
		//assign all of the ints used 
		
		//int for the sums 
		int sum=0;
		//int for avarage 
		int avg=0;
		//int for the smallest value 
		int smallest=500;
		//int for the largest value
		int biggest=0;
		//assign a random int 
		int random=0;
		
		
		//generate an array 
		int[] intarr = new int[20]; 
		//make the array full of random numbers 
		for (int i = 0; i<intarr.length;i++){
			intarr[i] = randomGenerator.nextInt(501);
		}
		//find the biggest number 
		for (int i2 = 0; i2<intarr.length;i2++){
			if (intarr[i2]>biggest){
				biggest = intarr[i2];
			}
		}
		//find the smallest number 
		for (int i2 = 0; i2<intarr.length;i2++){
			if (intarr[i2]<smallest){
				smallest = intarr[i2];
			}
		}
		//find the sum of everything 
		for (int i2 = 0; i2<intarr.length;i2++){
			sum = sum+intarr[i2];
			}
		//find the avarge using the sum 
		avg = (sum/intarr.length);
		
		
		
		
		
		
		
		
		//print all the numbers in the array 
		for (int i3 = 0; i3<intarr.length;i3++){
			System.out.print(intarr[i3]+",");
		}
		System.out.println("");
		//print the sum
		System.out.println("the sum of the array is "+sum);
		//print the avgerage
		System.out.println("the avarage of the array is "+avg);
		//print the biggest
		System.out.println("the biggest number in the array is "+biggest);
		//print the smallest 
		System.out.println("the smallest number in the array is "+smallest);
		
		
		
		
		
    }

}
