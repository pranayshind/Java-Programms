package Abstraction;


//Create an abstract class pen with methods write () and refill () as abstract methods 
//Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()


abstract class Pen{
	abstract void write();
	abstract void refill();
	void penName() {
		System.out.println(" Cello Gripper ");
	}
}

class FountainPen extends Pen{
	//all abstract methods which are initiated in abstract class are mandatory express in this class. 
	//methods which are not abstract are not mandatory to express here like penName()
	public void write(){
		System.out.println("Writing...");
		
	}
	public void refill() {
		System.out.println("Refilling pen....");
	}
	
	void changeNib() {
		System.out.println("Changing Nib.....");
	}
}
public class Pen_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FountainPen obj = new FountainPen();
		obj.write();
		obj.refill();
		obj.changeNib();
		obj.penName();

	}

}
