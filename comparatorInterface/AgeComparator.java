package comparatorInterface;

import java.util.Comparator;

public class AgeComparator implements Comparator<student>{

	@Override
	public int compare(student s1, student s2) {
		// TODO Auto-generated method stub
		if(s1.age==s2.age) {
			return 0;
		}
		else if(s1.age>s2.age) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
