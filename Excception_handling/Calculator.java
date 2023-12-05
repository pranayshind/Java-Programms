package Excception_handling;

import java.util.Scanner;

/*Exercise 6: You have to create a custom calculator with following operations:
    1. + -> Addition
    2. - -> Subtraction
    3. * -> Multiplication
    4. / -> Division
    which throws the following exceptions:
    1. Invalid input Exception ex: 8 & 9
    2. Cannot divide by 0 Exception
    3. Max Input Exception if any of the inputs is greater than 100000
    4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
     */



class InvalidIPException extends  Exception{
	public String toString() {
		return "Invalid input";
	}
}

class DivideException extends Exception{
	public String toString() {
	return "Cannot divide by 0";	
	}
}

class MaxIPExxception extends Exception{
	public String toString() {
		return "Input is >=100000";
	}
}


class MultiplyException extends Exception{
	public String toString() {
		return "Input is >= 7000";
	}
}

class calculatorOperations{
	double add(double a, double b) throws InvalidIPException,MaxIPExxception  {

	if(a>=10000 || b>=100000) {
		throw new MaxIPExxception();
	}
		return a+b;
	}
	double sub(double a, double b) throws InvalidIPException,MaxIPExxception {
		
		if(a>=10000 || b>=100000) {
			throw new MaxIPExxception();
		}

		return a-b;
	}
	double multiply(double a, double b)throws InvalidIPException,MaxIPExxception,MultiplyException {
	
		if(a>=10000 || b>=100000) {
			throw new MaxIPExxception();
		}
		else if(a>=7000 || b>=7000) {
			throw new MultiplyException();
		}

		return a*b;
	}
	double divide(double a, double b)throws InvalidIPException,MaxIPExxception,DivideException {
		
		 if(a>=10000 || b>=100000) {
			throw new MaxIPExxception();
		}
		else if(b==0) {
			throw new DivideException();
		}
		return a/b;
	}
	
	
}
public class Calculator {

	public static void main(String[] args) throws InvalidIPException, MaxIPExxception, MultiplyException, DivideException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		Double a= in.nextDouble();
		System.out.println("Enter sign: ");
		char s = in.next().charAt(0);
		System.out.println("Enter number: ");
		Double b=in.nextDouble();
		
		calculatorOperations obj = new calculatorOperations();
		
		switch(s) {
		case'+':
			System.out.println("answer is: "+obj.add(a, b));
			
			break;
		case'-':
			System.out.println("answer is: "+obj.sub(a, b));
			break;
		case'*':
			System.out.println("answer is: "+obj.multiply(a, b));
			break;
		case'/':
			System.out.println("answer is: "+obj.divide(a, b));
			break;
		default:
			throw new InvalidIPException();
			
		}
		
		
		

	}

}
