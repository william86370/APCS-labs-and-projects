
public class Student {
	//declare all the varuables
	
	//name
	private String name;
	//ID Number
	private int idnumber;
	//students GPA
	private Double gpa;
	
	
	public static void main(String[] args) {
		//do i need a main here?
	}
	
	//the constructor for student
	public Student (String name, int idnumber, double gpa) {
		this.name = name;
		this.idnumber = idnumber;
		this.gpa = gpa;
	}
	
	//the get name accesser
	public String getname() {
		return this.name;
	}
	
	//get ID Number accesser
	public int getidnumber() {
		return this.idnumber;
	}
	
	//get GPA accesser
	public Double getgpa(){
		return this.gpa;
	}
	
	//prints everything  
	public String toString() {
	      return "Name: "+name+"\nID Number: "+idnumber+ "\nGPA: "+gpa;
	    }
	
	
	
	
}
