package MutiThreading;

class Multi extends Thread{
	public void run() {
		System.out.println("thread is running");
	}
}



public class extending_thread_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi t1 = new Multi();
		Multi t2 = new Multi();
		t1.start();   //run method is automatically called when we called start()
		t2.start();

	}

}
