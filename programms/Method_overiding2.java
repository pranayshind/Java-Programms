package programms;

class Bank{
	int getInterestRate() {return 0;}
}
	
class SBI extends Bank{
	 int getInterestRate() {return 8;}
}
class Axis extends Bank{
		int getInterestRate() {return 9;}
}
class ICICI extends Bank{
	int getInterestRate() {return 7;}
}

public class Method_overiding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s = new SBI();
		Axis a = new Axis();
		ICICI i = new ICICI();
		
		System.out.println("SBI Rate of Interest : "+s.getInterestRate());
		System.out.println("Axis Rate of Interest : "+a.getInterestRate());
		System.out.println("ICICI Rate of Interest : "+i.getInterestRate());
	}

}
