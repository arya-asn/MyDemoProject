package CollectionDemos;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> s = new ArrayList<>();
		s.add("Arya");
		s.add("Trinfy");
		s.add("Train");
		s.add("Make");
		ArrayList<String> s1 = new ArrayList<>();
		s1.add("Blue");
		s1.add("green");
		s1.add("purple");
		s.addAll(s1);
		System.out.println(s);
		
		int si=s.size();
		System.out.println("Size :" +si);
		
		
		
		Boolean boolean1 = s.contains("Eat");
		System.out.println(boolean1);
		
		System.out.println(s.get(3));
		
		System.out.println(s.isEmpty());
		
		String st=s.remove(0);
		System.out.println(st);
		System.out.println(s.remove("Make"));
		System.out.println(s);
		
		
		

		

	}

}
