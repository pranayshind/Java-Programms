package programms;

class Main{
	
	//static variables
	static int a= 23;
	static int b;
	static int max;
	
	//static blocks
	static {
		System.out.println("First static block: ");
		b = a*4;
	}
	static {
		System.out.println("Second static Block: ");
		max = 30;
	}
	
	//static method
	static void display() {
		System.out.println("a =  "+a);
		System.out.println("b = "+b);
		System.out.println("max = "+max);
	}
	
	  
}


public class Static_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main.display();
		

	}

}
