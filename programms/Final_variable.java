package programms;

class Bike{
	final int speedlimit = 90;
	void run()
	{
		speedlimit = 400;
	}
}

public class Final_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Bike obj = new Bike();
		obj.run();
		
		
		

	}

}
//it will give compile time error because we cant change variable values after using final keyword