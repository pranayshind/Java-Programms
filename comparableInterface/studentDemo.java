package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;

public class studentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(101,"Sachin",25);
		student s2 = new student(105,"rachin",26);
		student s3 = new student(103,"kohli",27);
		student s4 = new student(125,"rahul",29);
		student s5 = new student(111,"rohit",23);
		
		ArrayList<student> l = new ArrayList<student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		
		Collections.sort(l);
		
		
		for(student s:l) {
			System.out.println(s.sid+" "+s.name+" "+s.age);
		}
		

	}

}
