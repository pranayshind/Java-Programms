package Excception_handling;

public class finally_1 {
	public static int div(){
		try {
			int a = 14;
			int b = 0;
			int c = a/b;
			return c;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally{
			System.out.println("...programm ...");
		}
		return -1;  //return -1 if try block fail to execute
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =div();
		System.out.println(a);

	}

}
