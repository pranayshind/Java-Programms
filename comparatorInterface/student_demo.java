package comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;

import comparatorInterface.student;

public class student_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(101,"s v "
				+ "achin",25);
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
		
		System.out.println("orignal data: ");
		
		for(student s:l) {
			System.out.println(s.sid+" "+s.name+" "+s.age);
		}
		
		System.out.println("Sorting data according to student id");
		Collections.sort(l, new sidComparator());
		for(student s:l) {
			System.out.println(s.sid+" "+s.name+" "+s.age);
		}
		
		System.out.println("Sorting data according to student name");
		Collections.sort(l, new nameComparator());
		for(student s:l) {
			System.out.println(s.sid+" "+s.name+" "+s.age);
		}
		
		System.out.println("Sorting data according to student age");
		Collections.sort(l, new AgeComparator());
		for(student s:l) {
			System.out.println(s.sid+" "+s.name+" "+s.age);
		}
		

	}

}
