package zoolab;
public class fish extends Animal {
	
	int age = 0;
	int scales = 0;
	
	// keyword “extends” makes this a subclass
// no instance variables; all are inherited from Animal 
/** 
* Constructor for objects of class myAnimal1
* Takes two parameters for the myAnimal1 name and sound. 
*/ 
	fish(String newName, String newSound,int scars1,int wrinkels1) 
{ // initialize inherited instance variables using the 
// superclass’ constructor 
super(newName, newSound); 
age = scars1;
scales = wrinkels1;
} 
	
	public String toString() 
	{ 
	String message = ("The fish " + getName() + " says ");
	message += (getSound() + " and is " + age + " years old and it has " + scales+ " scales" ); 
	return message; 
	} 
	
// no methods needed; all are inherited from Animal 
}