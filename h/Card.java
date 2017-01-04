package h;
class Card{  
   public Card(){
     name = "";
   }
   public Card(String n) {
    name = n;
   }
   public String getname(){
	   return name;
   }
   public boolean isExpired(){
      return false;
   }
   public void print(){
      System.out.println("Card holder: " + name);
   }
   private String name;
}
