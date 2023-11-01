package programms;

abstract class Maths{
	int var1, var2, var3;
	abstract void cal();

	void add()
	{
		var3=var1+var2;
		System.out.println("Addition: "+var3);
	}
}
class Arithmetic extends  Maths{
	Arithmetic(int x,int y){
		var1 = x;
		var2 = y;
	}
	void cal() {
		var3 = var1 -var2;
		System.out.println("subtraction: "+var3);
		
	}
}

public class abstract_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic a = new Arithmetic(30,18);
		a.cal();
		a.add(); 

	}

}
