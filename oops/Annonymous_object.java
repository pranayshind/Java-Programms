//Anonymous simply means nameless. An object which has no reference is known as an anonymous object. It can be used at the time of object creation only.

//If you have to use an object only once, an anonymous object is a good approach. 

package oops;

class calculation{
	void fact(int n) {
		int count = 1;
		for(int i=1;i<=n;i++) {
			count = count*i;
		}
		System.out.println("Factorial of "+n+" is "+count);
	}
}

public class Annonymous_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new calculation().fact(5);  //calling method with Annonymous object

	}

}
