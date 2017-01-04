package unit7;

   import java.util.*;
	
   public class OrderMatters{
      private double[][] orderedData;
      private int rows;
      private int cols;
   
      public OrderMatters(int numberOfRows, int numberOfColumns){
      
         rows = numberOfRows;
         cols = numberOfColumns;
         orderedData = new double[rows][cols];
      }
      public void rowOrder(double[] d){
    	  int count =0;
         for(int i = 0; i<rows; i++) {
            for(int k = 0; k<cols; k++) {
               orderedData[i][k] = d[count];
               count++;
            }
            
         }
      }
   	
      public void columOrder(double[] d){
         
      int count = 0;
          for(int i=0;i<rows;i++){
        	  orderedData[i][0] = d[i];
        	  count =i+4;
        	  for(int k=1;k<cols;k++){
        		  orderedData[i][k] = d[count];
        		  count+=4; 
        		  
             }  
        	 
          }
      }
          
          
          
      public static int[] reverse(int[] arrayOne) {
          for(int i = 0; i < arrayOne.length; i++)
          {
              int temp = arrayOne[i];
              arrayOne[i] = arrayOne[arrayOne.length - i - 1];
              arrayOne[arrayOne.length - 1] = temp;
              
          }
         
      }
          
          
          
          
      public void wrappedOrder(double[] d){
         int count = 0;
         for (int row2 = 0; row2 < rows; row2++) { 
            if (row2%2 == 0) {
               for (int i = 0; i < cols ;i++) { 
               
               orderedData[row2][i] = d[count];
               count++;
               }
            
            }
            else {
               for (int i = orderedData[row2].length-1; i > -1; i--) { 
               
            	   orderedData[row2][i] = d[count];
            	   count++;
               }
            
            }
          
         
         }      
      
      
      }
      public void print(){
    	  System.out.print("\t Col 0\tcol 1\tcol 2");
    	  System.out.println("");
    	  for(int i = 0;i<rows;i++){
    		  System.out.print("row "+ i);
    		  for(int k = 0; k<cols;k++){
    			  System.out.print("\t"+orderedData[i][k]+" ");
    		  }
    		  System.out.println("");
    	  }
    	  
      }
   	
   }
	
	
