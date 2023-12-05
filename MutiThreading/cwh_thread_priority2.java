package MutiThreading;

class thread_prio_2 extends Thread{
	public void run() {
		System.out.println(" Hello "+Thread.currentThread().getName());
		System.out.println(" Hello " +Thread.currentThread().getPriority());
	}
}

public class cwh_thread_priority2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread_prio_2 t1 = new thread_prio_2();
		thread_prio_2 t2 = new thread_prio_2();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();

	}

}
