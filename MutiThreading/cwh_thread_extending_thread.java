package MutiThreading;
//here if we dont use threading then first Thread1 will run and then thread2 but here both are running .

//Constructor => Thread()
class P_Thread1 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<80) {
			System.out.println("...Thread 1...");
			System.out.println("...Thread 1 is running..");
			i++;
		}
		
	}
}

class P_Thread2 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<80) {
			System.out.println("...Thread 2...");
			System.out.println("...Thread 2 is running..");
			i++;
		}
		
	}
}
public class cwh_thread_extending_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_Thread1 t1 = new P_Thread1();  //Constructor => Thread()
		P_Thread2 t2 = new P_Thread2();
		
		t1.start();
		t2.start();
		

	}

}
