package programms;

class Animal{
	void eat() {
		System.out.println("Eating..");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("barking..");
	}
}

public class Single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d =new Dog();
		d.bark();
		d.eat();

	}

}
