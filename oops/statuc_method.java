/*If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.
A static method can access static data member and can change the value of it.*/




package oops;
//Java Program to demonstrate the use of a static method.  
public class statuc_method {
	
	int rollno;
	String name;
	static String college = "dbj";    //static vaariable
	 //static method to change the value of static variable 
	static void change() {
		college = "wadia";   //static method  to change the  value of static variable
	}
	   //constructor to initialize the variable  	 
	statuc_method(int r,String n){
		rollno = r;
		name = n;
		
	}
	//method to display values  
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statuc_method.change();//calling change method  
	    //creating objects  
		statuc_method s1 = new statuc_method(40,"pranay");
		statuc_method s2 = new statuc_method(41,"sdjn");
		//calling display method  
		s1.display();
		s2.display();

	}

}
