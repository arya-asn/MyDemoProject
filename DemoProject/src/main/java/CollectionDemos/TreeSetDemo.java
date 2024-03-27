package CollectionDemos;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set <String> set=new TreeSet<>();
		set.add("Bob");
		set.add("Charlie");
		set.add("John");
		System.out.println(set);
		
		Boolean s=set.contains("John");
		System.out.println(s);

	}

}
