package programms;
class Player{
	String name;
	void getName(String n) {
		name =n;
	}
	void putName() {
		System.out.println("Name: "+name);
	}
	
}
class Record extends Player{
	float avg,srate;
	void getData(float a, float s) {
		avg =a;
		srate =s;
		
	}
	void putData() {
		System.out.println("Records:-");
		System.out.println("Average: "+avg);
		System.out.println("strie  rate: "+srate);
	}
}
interface IPL{
	void displayEarning();
}
interface Information{
	void getTeam(String t);
}
class Match extends Record implements IPL,Information{
	long earn;
	Match(long e){
		earn = e;
	}
	public void displayEarning() {
		System.out.println("His earning: "+earn);
		System.out.println
		 ("Rupees");
	}
	public void getTeam(String t) {
		System.out.println("Team: "+t);
	}
}


public class INterface_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Match s = new Match(100000);
		s.getName("V k");
		s.putName();
		s.getTeam("RCB");
		s.getData(30.52f,123.45f);
		s.putData();
		s.displayEarning();
		
		

	}

}
