package programms;


class Animal_1{
	void  eat() {
		System.out.println("Eating..");
	}
}

class Dog_1 extends Animal_1{
	void bark() {
		System.out.println("barking..");
	}
}
class Cat extends Animal_1{
	void meow() {
		System.out.println("meowing..");
	}
}


public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.meow();
		c.eat();
		//c.bark();=> c.t. error

	}

}
