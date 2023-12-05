package comparatorJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparator_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<employee> l =new ArrayList<employee>();
		l.add(new employee(101,"Rohit","Captain"));
		l.add(new employee(151,"Rahul","Coach"));
		l.add(new employee(111,"Shami","Bowler"));
		l.add(new employee(104,"Ravindra","Allrounder"));
		
		System.out.println("orignaml data");
		for(employee e:l) {
			System.out.println(e);
		}
		
		Comparator<employee> c1 = Comparator.comparing(employee::getName);
		Collections.sort(l,c1);
		
		System.out.println("Sort according to names: ");
		for(employee e:l) {
			System.out.println(e);
		}
		System.out.println("Sort according to designation: ");
		Comparator<employee> c2 = Comparator.comparing(employee::getDesignation);
		Collections.sort(l,c2);
		for(employee e:l) {
			System.out.println(e);
		}
		
		System.out.println("Sort according to id: ");
		Comparator<employee> c3 = Comparator.comparing(employee::getId);
		Collections.sort(l,c3);
		for(employee e:l) {
			System.out.println(e);
		}
		

	}

}
