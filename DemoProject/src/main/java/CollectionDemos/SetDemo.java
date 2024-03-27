package CollectionDemos;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		//creating set and adding element
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Apple");//duplicate elements will be ignored
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(6);
		set2.add(3);
		set2.add(4);
		
		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println("Union: " + union);
		
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection: " + intersection);
		
		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println("Difference: " + difference);
		
	}

}
