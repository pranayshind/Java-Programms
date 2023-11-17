package Set;
import java.util.HashSet;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> n = new HashSet<Integer>();//create hashset object n
		
		//add values to set
		n.add(1);
		n.add(4);
		n.add(5);
		n.add(7);
		
		//show which number between 1 to 10 in set
		for(int i=0;i<=10;i++) {
			if(n.contains(i)) {
				System.out.println(i+" was found in set");
			}
			else {
				System.out.println(i+" was not found in set");
			}
		}

	}

}
