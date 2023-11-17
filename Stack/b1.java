package Stack;

import java.util.Stack;

public class b1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> s = new Stack<>();
		System.out.println("stack: "+s);
		
		pushmethod(s,20);
		pushmethod(s,13);
		pushmethod(s,89);
		pushmethod(s,90);
		pushmethod(s,11);
		pushmethod(s,45);
		pushmethod(s,18);
		
		popmethod(s);
		popmethod(s);
		popmethod(s);
	}
		
		//push method
		static void pushmethod(Stack s,int x) {
			s.push(x);
			System.out.println("push -> "+x);
			System.out.println("stack: "+s);
			
		}
		
		//pop method
		static void popmethod(Stack s) {
			System.out.print("pop -> ");
			System.out.println(s.pop());
			System.out.println("stack: "+s);
		}

	}


