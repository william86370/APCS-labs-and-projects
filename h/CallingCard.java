package h;

class CallingCard extends Card {  
	private int Cardnumber;
	private int PIN;
   public CallingCard (){
     super();
     Cardnumber = 0;
     PIN = 0;
   }
   public CallingCard (String n,int incard,int inpin) {
    super(n);
    Cardnumber = incard;
    PIN = inpin;
   }
   
   public void print(){
      System.out.println("Card holder: " + super.getname()+ " the card number is "+ Cardnumber + "the pin is "+ PIN);
   }
  
}
