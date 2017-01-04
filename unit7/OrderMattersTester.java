package unit7;

   import java.util.*;
	
   public class OrderMattersTester{
   
      public static void main(String args[]){
		OrderMatters wot = new OrderMatters(4, 3);
		int[] orderedData = {1,2,3,4,5,6,7,8,9,10,11,12};
	//	wot.rowOrder(orderedData);
		wot.print();
		System.out.println(wot.reverse(orderedData));
		System.out.println("");
		//wot.columOrder(orderedData);
		
		wot.print();
		System.out.println("");
		//wot.wrappedOrder(orderedData); 
		wot.print();
      }
   }