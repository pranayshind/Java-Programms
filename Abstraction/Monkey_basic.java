package Abstraction;

//Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits this monkey class and 
//implements basicanimal interface with eat ( ) and sleep methods 

class monkey{
	void jump() {
		System.out.println("Jumping");
	}
	void bite() {
		System.out.println("Biting");
	}
}
	
interface basicAnimal{
	void eat();         //this is by default public method beause in interface all methods are by default public
}

class human extends monkey implements basicAnimal{
	public void eat() { 
		System.out.println("Eating...");
		
	}
	public void sleep() { 
		System.out.println("sleeping...");
		
	}
	
	void speak() {
		System.out.println("Hello sir");
	}
}
	


public class Monkey_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human obj = new human();
		obj.eat();
		obj.sleep();
		obj.jump();
		obj.bite();
		obj.speak();
		

	}

}
