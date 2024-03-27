package CollectionDemos;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("working");
		list.add("In Trinfy");
		System.out.println(list);
		
		list.addFirst("I am");
		list.addLast("Since 2022");
		System.out.println(list);
		
		String a=list.getFirst();
		System.out.println(a);
		
		String b=list.getLast();
		System.out.println(b);
		
		String c=list.get(2);
		System.out.println(c);
		
		Boolean d=list.contains("working");
		System.out.println(d);
		
		String e =list.element();
		System.out.println(e); //retrieve
		
		String f =list.removeFirst();
		System.out.println(f); //remove
		
		System.out.println(list);

	}

}
