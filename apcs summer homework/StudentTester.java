
public class StudentTester {
	public static void main(String[] args) {
		//assign all the users there states
		Student s1 = new Student("william wright",1357310,3.6);
		Student s2 = new Student("jack burke",1257555,3.5);
		Student s3 = new Student("chris long",2543876,1.6);
		Student s4 = new Student("moon coach",1357959,4.6);
		Student s5 = new Student("carloss coach",4733789,2.6);
		
		//print s1 all info 
		System.out.println(s1.toString());
		System.out.println("");
		//print the second persons ID
		System.out.println(s2.getidnumber());
		System.out.println("");
		//print the third students name
		System.out.println(s3.getname());
		System.out.println("");
		//print the fourth student GPA
		System.out.println(s4.getgpa());
		System.out.println("");
		 
		//print all students 
		System.out.println(s1.toString());
		System.out.println("");
		System.out.println(s2.toString());
		System.out.println("");
		System.out.println(s3.toString());
		System.out.println("");
		System.out.println(s4.toString());
		System.out.println("");
		System.out.println(s5.toString());
		System.out.println("");

		
		
		
		
	}
}
