package CollectionDemos;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List <String> list = new ArrayList<String>();
		list.add("Arya");
		list.add("Devu");
		list.add("Nisha");
		System.out.println(list);
		
		list.set(1, "Deva");
		System.out.println(list);
		
		
		List<Integer>list1=new ArrayList<Integer>();
		list1.add(23);
		list1.add(45);
		list1.add(34);
		list1.add(45);
		System.out.println(list1);
		
		Boolean check = list1.isEmpty();
		System.out.println("Empty or not --->"+check);
		
		Boolean check1=list1.equals(list);
		System.out.println("Equals or not---->"+check1);
		
		//After adding element in index
		list1.add(4, 98);
		System.out.println(list1);
		
		list1.get(3);
		
		
		int index=list1.indexOf(45);
		System.out.println(index);
		int index1=list1.lastIndexOf(45);
		System.out.println(index1);
		
		

	}

}
