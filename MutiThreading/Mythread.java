package MutiThreading;

public class Mythread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an object of thread  class using constructor 
		Thread t = new Thread("My first thread");
		t.start();
		String str = t.getName();
		System.out.println(str);

	}

}
