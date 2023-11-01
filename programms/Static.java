package programms;

class StaticTest{
	int multiply(int a,int b) {
		return a*b;
	}
	
	static int add(int a,int b) {
		return a+b;
	}
}

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticTest st = new StaticTest();
		
		System.out.println(st.multiply(2,2));
		System.out.println(StaticTest.add(2,3));

	}

}
