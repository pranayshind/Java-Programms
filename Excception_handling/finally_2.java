package Excception_handling;

public class finally_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 1024;
		int b =6;
		while(true) {
			try {
				System.out.println(a+" divide by "+b+" is "+a/b);
			}
			catch(Exception e) {
				System.out.println(e);
				break;
			}
			finally {
				System.out.println("...I am finally....: value of b is: "+b);
			}
			b--;
		}

	}

}
