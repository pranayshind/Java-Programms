package Excception_handling;



public class Throws {
	
	
	
	//method written by Harry
	public static int divide(int a,int b) throws ArithmeticException {
		int result = a/b;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method wriiten by shivam
		
		
		try {
		int c = divide(10,0);
		System.out.println(c);
		}
		catch (ArithmeticException e) {
			
			System.out.println("number cannot divivde by 0");
		}
		
		catch(Exception e){
			System.out.println("some other exception");
			
		}
		
		

	}

}
