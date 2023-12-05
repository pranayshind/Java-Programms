package Excception_handling;

public class With_try_catch {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b = 0;
		try {
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println("We failed to divede, reason is: ");
			System.out.println(e);
		}
		
		System.out.println("....Programm end....");

	}

}
