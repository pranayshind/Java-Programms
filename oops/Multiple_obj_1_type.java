
//We can create multiple objects by one type only as we do in case of primitives.

//Initialization of primitive variables:  int a=10, b=20;  
package oops;


class Rect_2{
	int length;
	int width;
	void insert(int l, int w ) {
		length = l;
		width = w;
	}
	void display(){
		System.out.println("Area of "+length+" and "+ width +" is "+ (length*width));
	}
}

public class Multiple_obj_1_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect_2 r1 = new Rect_2() , r2 = new Rect_2() ,  r3 = new Rect_2();
		
		r1.insert(10,2);
		r2.insert(20,4);
		r3.insert(30,3);
		
		r1.display();
		r2.display();
		r3.display();

	}

}
