package programms;

class Vehicle{
	void run() {System.out.println("vehicle is running");}
}

class Bike2 extends Vehicle{
	void run() {System.out.println("Bike is running safety");}
	
}

public class Method_overriding {
	public static void main(String[] args) {
		Bike2 obj = new Bike2();
		obj.run();
	}

}
