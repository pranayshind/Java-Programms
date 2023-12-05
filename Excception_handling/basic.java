package Excception_handling;

//exception is any unwanted event that will disturb normal execution => ex.sujal bike puncture while coming for class regularly on time
//exceptions cannot be avoided but they can be handled
//Exception handling means writing some backup code that handles the statement that may cause exception/error in future
//for  ex. if connectivity problem occur during loading data from head office server then backup code should written to access data from local server
//abnormal termination  and normal termination
//when jvm removes main method of programm from stack then it is known as normal termination

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Main");
		doStuff();
	//  System.out.println(10/0);
		System.out.println("Main End");

	}
	
	public static void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to doStuff");
		doMoreStuff();
//		System.out.println(10/0);
		System.out.println("doStuff End");

	}
	
	public static void doMoreStuff(){
		// TODO Auto-generated method stub
		System.out.println("Welcome to doMoreStuff");
  		System.out.println(10/0);
		System.out.println("doMoreStuff End");

	}

}
