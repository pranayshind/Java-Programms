package MutiThreading;

public class TestSleepMethhod extends Thread {
	public void run() {
		for(int i=1;i<5;i++) {
			try {Thread.sleep(100);
		        }
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSleepMethhod t1 = new TestSleepMethhod();
		TestSleepMethhod t2 = new TestSleepMethhod();
		
		t1.start();
		t2.start();

	}

}
