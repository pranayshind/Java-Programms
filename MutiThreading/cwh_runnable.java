package MutiThreading;

//costructor Thread(Runnable r)

class thread_run1 implements Runnable{
	

	@Override
	public void run() {
		int i=1;
		// TODO Auto-generated method stub
		while(i<80) {
		System.out.println("...Thraed1....");
		System.out.println("...Thraed1 Running....");
		i++;
		
		}
	}
}
class thread_run2 implements Runnable{

	@Override
	public void run() {
		int i=1;
		// TODO Auto-generated method stub
		while(i<80) {
		System.out.println("...Thraed2....");
		System.out.println("...Thraed2 Running....");
		i++;
		}
		
	}
	
}

public class cwh_runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thread_run1 bullet1  = new thread_run1();
		Thread gun1 = new Thread(bullet1);     //costructor Thread(Runnable r)
		
		thread_run2 bullet2 = new thread_run2();
		Thread gun2 = new Thread(bullet2);
		
		gun1.start();
		gun2.start();

	}

}
