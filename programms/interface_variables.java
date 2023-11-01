package programms;
interface Constants{
	double PI =3.14;
	String unit = "sq.cm";
	
}
interface Values{
	int cir = 2;
}

public class interface_variables implements Constants{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = 5.83;
		System.out.println("Area of circle: ");
		System.out.println(PI*radius*radius+unit);
		System.out.println("perimeter of circle: ");
		System.out.println(Values.cir*PI*radius+unit);

	}

}
 