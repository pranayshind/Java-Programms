package MutiThreading;

class Multi3 implements Runnable{
	public void run() {
		System.out.println("Thread is running");
	}
}

public class implementing_runnable_immterfaace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi3 m1 = new Multi3();
		Thread t1 = new Thread(m1);  //using constructor Thread(runnable r)
		t1.start();
		

	}

}
