package CollectionDemos;

import java.util.ArrayList;
import java.util.List;

public class ListFunction {

	public static void main(String[] args) {
		List<String> string = new ArrayList<>();
		string.add("My");
		string.add("name");
		string.add("Arya");
		System.out.println(string);
		boolean m = string.contains("Arya");
		String r = string.get(1);
		System.out.println(m);
		System.out.println(r);
		string.remove(0);
		System.out.println(string);

	}

}
