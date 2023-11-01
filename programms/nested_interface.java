package programms;
class first{
	
	public interface myInterface{
		void add(int a,int b);
		
	}
}
class second implements first.myInterface{
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}

public class nested_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		second s = new second();
		s.add(10, 20);
  
	}

}
