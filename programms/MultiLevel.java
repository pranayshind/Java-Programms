package programms;


class Animal3{
	void eat() {System.out.println("eating...");
}}
class Dog2 extends Animal3{
	void bark() {System.out.println("barking...");
}}
class BabyDog extends Dog2{
	void weep() {System.out.println("weeping...");
}}
public class MultiLevel {
	public static void main(String[] args) {
		
		BabyDog b = new BabyDog();
		
		b.eat();
		b.bark();
		b.weep();
	}
}
	





