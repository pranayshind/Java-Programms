package Excception_handling;

public class try_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(50/0);
			
		}
		finally {
			System.out.println("I am finally");
		}

	}

}
