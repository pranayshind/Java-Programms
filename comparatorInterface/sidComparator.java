package comparatorInterface;

import java.util.Comparator;

public class sidComparator implements Comparator<student>{

	@Override
	public int compare(student s1, student s2) {
		// TODO Auto-generated method stub
		if(s1.sid==s2.sid) {
			return 0;
		}
		else if(s1.sid>s2.sid) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
