package zoolab;
public class manatee extends Animal {
	
	int scars = 0;
	int wrinkels = 0;
	
	// keyword “extends” makes this a subclass
// no instance variables; all are inherited from Animal 
/** 
* Constructor for objects of class myAnimal1
* Takes two parameters for the myAnimal1 name and sound. 
*/ 
	manatee(String newName, String newSound,int scars1,int wrinkels1) 
{ // initialize inherited instance variables using the 
// superclass’ constructor 
super(newName, newSound); 
scars = scars1;
wrinkels = wrinkels1;
} 
	
	public String toString() 
	{ 
	String message = ("The manatee " + getName() + " says ");
	message += (getSound() + " and has " + scars + " scars and has " + wrinkels + " wrinkels"); 
	return message; 
	} 
	
// no methods needed; all are inherited from Animal 
}