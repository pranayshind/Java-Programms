package MutiThreading;

//consrtuctor Thread(String)

class Thread_con extends Thread{
	public Thread_con(String m) {
		super(m);
	}
	public void run() {
		System.out.println("hello");
	}
}

public class cwh_constructor_Thread_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_con t1 = new Thread_con("i am pranay");//consrtuctor Thread(String)
		Thread_con t2 = new Thread_con("doing full stack java");//consrtuctor => Thread(String)
		t1.start();
		
		System.out.println("id of thread is: "+t1.getId());
		System.out.println("name of thread is: "+t1.getName());
		
		t2.start();
		System.out.println("id of thread is: "+t2.getId());
		System.out.println("name of thread is: "+t2.getName());


	}

}
