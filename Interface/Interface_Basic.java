package Interface;

interface Bicycle{

	void applyBrake(int decrement);
	void applySpeed(int increment);
	
}

interface HornBicycle{
	void blowHornK3g();
	void blowHornMHN();
}

class HeroCycle implements Bicycle,HornBicycle{   //multiple  inheritance is only possible in java is through interface
	public  void applyBrake(int decrement) {
		System.out.println("Applying Brake: ");
	}
	public void applySpeed(int increment) {
		System.out.println("Applying speed: ");
	}
	public void blowHornK3g() {
		System.out.println("Kabhi khushi kabhi gam");
	}
	public void blowHornMHN() {
		System.out.println("Main hoon na");
	}
}

public class Interface_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroCycle obj = new HeroCycle();
		obj.applyBrake(40);
		obj.applySpeed(10);
		obj.blowHornK3g();
		obj.blowHornMHN();
		
		
		

	}

}
