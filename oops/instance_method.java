/*The method of the class is known as an instance method. It is a non-static method defined in the class. Before calling or invoking the 
instance method, it is necessary to create an object of its class. Let's see an example of an instance method.
*/


package oops;

public class instance_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instance_method i = new instance_method();
		int var;
		var = i.add(10,45);
		System.out.println(var);
		
		
	}
		
	int s;
	public int add(int a,int b) {
		
		s= a+b;
		return s;
		
	}

	}


