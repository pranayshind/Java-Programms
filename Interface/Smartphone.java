package Interface;


interface Camera{
	void takeSnap();
	void recordVideo();
}

interface Wifi{
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

public class Smartphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone obj =new Phone();
		obj.recordVideo();
		obj.takeSnap();
		String[] arr = obj.getNetworks();
		for(String i: arr) {
			System.out.println(i);
		}
		obj.connectToNetwork("Harry");

	}

}
