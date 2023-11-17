package Stack;
import java.util.Stack;

public class stack_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1 = new Stack();
		System.out.println(s1.empty());
		
		s1.push(100);
		s1.push(200);
		s1.push(300);
		s1.push(400);
		s1.push(300);
		s1.push(500);
		s1.push(100);
		
		
		System.out.println(s1.empty());
		
		
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1);
		
		
		System.out.println(s1.peek());// only return last element without removing it
		System.out.println(s1);
		
		System.out.println(s1.search(300));// returns index
		
	}

}
