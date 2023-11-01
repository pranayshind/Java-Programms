package programms;
import java.util.Scanner;
interface Bicycle{
	void applyBrake(int decrementspeed);
	void accelerate(int incrementspeed);
}
 class Herocycle implements Bicycle{
	private int speed;
	public void setspeed(int speed) {
		this.speed = speed;
	}
	public void applyBrake(int decrementspeed) {
		speed = speed - decrementspeed;
		System.out.println("New speed = "+speed);
	}
	public void accelerate(int incrementspeed) {
		speed = speed + incrementspeed;
		System.out.println("New speed = "+speed);
	}
	
	
}

public class Simpleinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Herocycle hc = new Herocycle();
		System.out.println("Enter initial speed of bicycle is: ");
		
	int newspeed = in.nextInt();
	hc.setspeed(newspeed);
	System.out.println("Enter 1 for accelerate");
	System.out.println("Enter 2 for aplying brake");
	int ch = in.nextInt();
	if(ch==1) {
		System.out.println("Enter Increment speed");
		int n = in.nextInt();
		hc.accelerate(n);
	}
	else {
		System.out.println("Enter decrement speed");
		int n = in.nextInt();
		hc.applyBrake(n);
	}
		
		

	}

}
