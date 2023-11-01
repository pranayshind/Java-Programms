package programms;


class Test{
	static int max=10;  //static variable
	int min = 5; //non static variable
}

public class static_nonstatic {

	public static void main(String[] args) {
		
		Test obj = new Test();
		System.out.println("min + 1= "+(obj.min+1));
		System.out.println("max + 1 ="+(Test.max+1. ));
		// TODO Auto-generated method stub

	}

}
