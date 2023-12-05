package comparatorInterface;

import java.util.Comparator;

public class nameComparator implements Comparator<student>{

	@Override
	public int compare(student s1, student s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}

}
