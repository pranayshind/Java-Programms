package MutiThreading;


class Thread_meth implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread());
	}
}

public class Method_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_meth t = new Thread_meth();
		Thread obj1 = new Thread(t,"hi.. 1st New Thread");
		Thread obj2 = new Thread(t,"hi.. 2nd New Thread");
		Thread obj3 = new Thread(t,"hi.. 3rd New Thread");
		
		obj1.setPriority(10);
		obj2.setPriority(3);
		obj3.setPriority(8);  
		
		
		System.out.println("Priority of thread: "+ obj1.getPriority());
		System.out.println("Name of thread: "+obj1.getName());
		
		System.out.println("Priority of thread: "+ obj2.getPriority());
		System.out.println("Name of thread: "+obj2.getName());
		
		System.out.println("Priority of thread: "+ obj3.getPriority());
		System.out.println("Name of thread: "+obj3.getName());
		
		obj1.start();
		obj2.start();
		obj3.start();

	}

}
