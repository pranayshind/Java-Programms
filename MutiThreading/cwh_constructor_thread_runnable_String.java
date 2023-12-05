package MutiThreading;

//constructor(Runnable r,String name)

class thread_con_run implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello executing run method");
		
	}
	
}

public class cwh_constructor_thread_runnable_String {
	public static void main(String[] args) {
		thread_con_run bullet1 = new thread_con_run();
		Thread gun1 = new Thread(bullet1,"I am thread1");  //constructor => (Runnable r,String name)
		gun1.start();
		System.out.println("id of thread 1 is: "+gun1.getId());
		System.out.println("name of thread 1 is: "+gun1.getName());
		
		
		thread_con_run bullet2 = new thread_con_run();
		Thread gun2 = new Thread(bullet2,"I am thread2"); //constructor => (Runnable r,String name)
		gun2.start();
		System.out.println("id of thread 2 is: "+gun2.getId());
		System.out.println("name of thread 2 is: "+gun2.getName());
	}

}
