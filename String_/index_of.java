package String_;

public class index_of {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I love java and python";
		System.out.println(s.indexOf('j'));
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf('v',5));//it will start searching after 5th index
		System.out.println(s.indexOf("ve"));
		

	}

}
