package MutiThreading;

class thread_prio extends Thread{

	public thread_prio(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void run(){
		int i=1;
		
		
		//do not run this programm it will go in infinite loop it is only for understandintg purpose that t5 will give more priority than others
		
		
		//while(true) {
		System.out.println(this.getName());
		i++;
		}
	
	}

//}

public class cwh_Thread_priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread_prio t1 = new thread_prio(" t1 thread ");
		thread_prio t2 = new thread_prio(" t2 thread ");
		thread_prio t3 = new thread_prio(" t3 thread ");
		thread_prio t4 = new thread_prio(" t4 thread ");
		thread_prio t5 = new thread_prio(" ***most imp/priority*** => t5  thread ");
		
		t5.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
