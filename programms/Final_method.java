package programms;

class Bike{
	final void run() {System.out.println("running");}
}

class Honda extends Bike{
	void run() {System.out.println("running safety with 100kmph");
}



public class Final_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda honda = new Honda();
		honda.run()
				
				

	}

}

//it will give compile time error because we cant change method  after using final keyword
