package MutiThreading;

class sleep1 extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			try{
				Thread.sleep(100);
				}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class sleep2 extends Thread{
	public void run() {
		for(int i=10;i<15;i++) {
			try{
				Thread.sleep(100);
				}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
	}
}


public class TestSleep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sleep1 t1 = new sleep1();
		sleep2 t2 = new sleep2();
		
		t1.setPriority(t1.MAX_PRIORITY);
		t2.setPriority(t2.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		

	}

}
