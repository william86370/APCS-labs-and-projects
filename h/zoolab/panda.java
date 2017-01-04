package zoolab;
public class panda extends Animal {
	
	int weight = 0;
	int iq = 0;
	
	// keyword “extends” makes this a subclass
// no instance variables; all are inherited from Animal 
/** 
* Constructor for objects of class myAnimal1
* Takes two parameters for the myAnimal1 name and sound. 
*/ 
	panda(String newName, String newSound,int scars1,int wrinkels1) 
{ // initialize inherited instance variables using the 
// superclass’ constructor 
super(newName, newSound); 
weight = scars1;
iq = wrinkels1;
} 
	
	public String toString() 
	{ 
	String message = ("The panda " + getName() + " says ");
	message += (getSound() + " and weighs " + weight + " pounds and its iq is " + iq ); 
	return message; 
	} 
	
// no methods needed; all are inherited from Animal 
}