package Polymorphism;



interface Camera{
	void takeSnap();
	void recordVideo();
}

interface Wifi{
	void notification();
	String[] getNetworks();
	void connectToNetwork(String network);
}

class CellPhone{
	void callNumber(int number) {
		System.out.println("calling number: "+ number);
	}
	void pickCall() {
		System.out.println("Connecting....");
	}
}

class Phone extends CellPhone implements Wifi,Camera{
	public void takeSnap(){
		System.out.println("Taking Snap");
	}
	public void recordVideo() {
		System.out.println("Rcording video");
	}
	public void notification() {
		System.out.println("Wifi is turned on ");
	}
	
	public void connectToNetwork(String network) {
		System.out.println("Connecting to "+network);
		
	}
	
	public String[] getNetworks() {
		// TODO Auto-generated method stub
		System.out.println("Getting List of Networks: ");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
	}
	
}

public class Poly_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Camera obj =new Phone();
		//polymorphism means if we take object of phone and reference of Camera then it will to allow only those methods which are present in camera
		obj.recordVideo();
		obj.takeSnap();
		//obj.notification();  => it is not allowed
		
	

	}

}


