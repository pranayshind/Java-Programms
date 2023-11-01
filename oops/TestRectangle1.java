package oops;

class Rect{
	int length;
	int width;

void area(int l, int w){
	length = l;
	width = w;	
}

void display() {
	System.out.println("Area of rectangle is "+(length*width));
}
}

public class TestRectangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect();
		Rect r2 = new Rect();
		
		r1.area(10,5);
		r2.area(14,4);
		
		r1.display();
		r2.display();
		

	}

}
