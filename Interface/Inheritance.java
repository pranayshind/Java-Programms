package Interface;


interface sample1{
	void meth1();
	void meth2();
}

interface sample2 extends sample1{
	void meth3();
	void meth4();
}

class sample3 implements sample2{
	public void meth1() {
		System.out.println("method1");
	}
	public void meth2() {
		System.out.println("method2");
	}
	public void meth3() {
		System.out.println("method3");
	}
	public void meth4() {
		System.out.println("method4");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample3 obj = new sample3();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();

	}

}
