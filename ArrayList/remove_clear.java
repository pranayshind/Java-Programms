		package ArrayList;

		import java.util.ArrayList;

		public class remove_clear {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("gaurav");
		list.add("Anuj");
		System.out.println("initial list of elements: "+list); 
		
		list.remove("Vijay");
		System.out.println("after removing specific element by using direct value: "+list);
		
		list.remove(0);
		System.out.println("after removing specific element by using indexing: "+list);
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("sahil");
		list2.add("rahul");
		System.out.println("list 2 elements: "+list2);
		list.addAll(list2);
		System.out.println("after adding list2  to first list "+list);
		
		list.removeAll(list2);
		System.out.println("after removing elemnts of list2: "+list);
		
		list.removeIf(str -> str.contains("Ajay"));
		System.out.println("after using remove if condition: "+list);
		
		list.clear();
		System.out.println("After using clear method: "+list);

		
	}

}
