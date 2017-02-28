package UtilityClasses;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Z");
		a.add("A");
		a.add("K");
		a.add("N");
		//a.add(new Integer(10));
		//a.add(null);
		
		System.out.println("Before Sorting "+a);
		Collections.sort(a);
		System.out.println("After Sorting "+a);
	}

}
