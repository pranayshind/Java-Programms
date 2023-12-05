package Excception_handling;

public class Exception_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(10/0);
		}
		
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			
		}

	}

}
