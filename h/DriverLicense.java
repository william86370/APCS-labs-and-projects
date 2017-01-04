package h;
class DriverLicense extends Card {  
	private int age;
	private int licenseNum;
   public DriverLicense (){
     super("");
   }
   public DriverLicense (String n,int ex,int agein) {
    super(n);
    licenseNum = ex;
    age = agein;
   }
   
   public void print(){
      System.out.println("Card holder: " + super.getname()+" and the licenseNum is "+licenseNum);
   }
  
}
