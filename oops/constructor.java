/*In Java, a constructor is a block of codes similar to the method.
Rules for creating Java constructor
There are two rules defined for the constructor.

Constructor name must be the same as its class name
A Constructor must have no explicit return type
A Java constructor cannot be abstract, static, final, and synchronized


Every time an object is created using the new() keyword, at least one constructor is called.

It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.*/

package oops;

//default constructor

public class constructor {
	constructor(){
		System.out.println("Bike is created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor c1 = new constructor();

	}

}
