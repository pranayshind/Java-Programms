package programms;

class Demo{
	int age;
	static int age2;
}
public class StaticVariable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d = new Demo();
		d.age = 10;     // by creating object
		Demo.age2 = 23; //without creating object
		
		System.out.println("age = " +d.age );
		System.out.println("age = " +Demo.age2 );

	}

}
