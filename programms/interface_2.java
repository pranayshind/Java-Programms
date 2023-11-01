package programms;
interface Drawable{
	void draw();
}
class Rectangle implements Drawable{
	public void draw() {System.out.println("drawing rectangle");} 

}
class Circle implements Drawable{
			public void draw() {System.out.println("drawing cirle");}
			
			}
public class interface_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d =new Circle();
		d.draw();

	}

}
