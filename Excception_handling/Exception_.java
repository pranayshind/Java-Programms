package Excception_handling;

public class Exception_ {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception");
			
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}

}
