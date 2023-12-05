package comparableInterface;


public class student implements Comparable<student>{
	public int sid;
	public String name;
	public int age;
	public student(int sid, String name, int age) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(student st) {
		// TODO Auto-generated method stub
		
		 if(sid==st.sid)
		 { return 0; } 
		 else if(sid<st.sid)
		 { return 1; } 
		 else 
		 { return
		 -1; }
		 
		/*
		 * if(age==st.age) { return 0; } else if(age>st.age) { return 1; } else { return
		 * -1; }
		 */
	}
	

}
