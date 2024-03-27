package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("YELLOW");
		colors.add("GREEN");
		colors.add("PURPLE");
		colors.add("PINK");
		
		Iterator<String> iter=colors.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
				
		}
		
		
			
	}
		
		
		
		

	}


