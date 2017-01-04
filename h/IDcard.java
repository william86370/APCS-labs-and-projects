package h;
class IDcard extends Card {  
	private int IDnumber;
   public IDcard (){
     super("");
     IDnumber = 0;
   }
   public IDcard (String n,int numin) {
    super(n);
    IDnumber = numin;
   }
   
   public void print(){
      
      System.out.println("the card name is "+ super.getname() +" and the card number is "+IDnumber);
   }
   
}
