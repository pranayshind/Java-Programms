package Excception_handling;
class neg_radius_exception extends Exception{
	@Override
	public String toString() {
		return "radius cannot be negative";
	}
	@Override
	public String getMessage() {
		return "check enetred radius";
	}
}

public class Throws_2 {
	
	public static double area_circle(int r) throws neg_radius_exception {
		if(r<0) {
			throw new neg_radius_exception();
		}
		else {
		double area = Math.PI*r*r;
		return area;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// double a = area_circle(4); => surrounnd with try catch block or add throws declaration error will give
		try {
			double a = area_circle(-4);    //=> here you can entered radius value
			System.out.println("Area of circle is: "+a);
		}
		catch(Exception e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
