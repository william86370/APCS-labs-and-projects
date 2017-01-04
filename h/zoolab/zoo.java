package zoolab;

import java.util.ArrayList;

public class zoo {

	
	static ArrayList<Animal> residents;
	public zoo() {
		residents = new ArrayList<Animal>();
		Cow cow1 = new Cow("billy","moo");
		Camel camel1 = new Camel("jack","BMRUEHHHHHH",4);
		manatee man = new manatee("horratio","ohhnrjidgni",9,10);
		panda pan = new panda("xxx_soul666eater_xxx","muh",350,35);
		fish fi = new fish("pablo","blub",1,300);
		residents.add(cow1);
		residents.add(camel1);
		residents.add(man);
		residents.add(pan);
		residents.add(fi);
		
		
		
	}
	
	public static void getResidents() {
		for(int i = 0 ;i<residents.size();i++){
			System.out.println(residents.get(i).toString());
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zoo zoo1 = new zoo();
		getResidents();
		
		
		
	}

}
