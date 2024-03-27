package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;


public class Assignment1 {

	public static void main(String[] args) {
		//Question1
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Purple");
		colors.add("Violet");
		
		System.out.println("The colors are "+colors);
		
		//Question 5-Search element
		String searchElement = "Red";
		int index = colors.indexOf(searchElement);
		if(index !=-1) {
			System.out.println("Element is at :" + index);
		}
		else {
			System.out.println("Element not found");
		}
		//Question 2-Retrive an element
		
		String getElement=colors.get(1);
		System.out.println("Retreving the element of Index 1 "+getElement);
		
		//Question 3-Iterate through all elements
		Iterator<String> iter=colors.iterator();
		while(iter.hasNext()) {
			System.out.println("Iterated colors : "+iter.next());
			

	}
		//Question 4-Remove Element
		if(colors.size()>=3) {
			colors.remove(2);
			System.out.println("Elememt Removed Successfully");
		}
			else {
				System.out.println("Element doesnt removed");
			}
		}
	
		

}

