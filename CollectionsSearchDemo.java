package UtilityClasses;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Z");
		a.add("A");
		a.add("K");
		a.add("N");
		
		System.out.println("Before Sorting "+a);
		Collections.sort(a);
		System.out.println("After Sorting "+a);
		
		System.out.println(Collections.binarySearch(a, "Z"));
		System.out.println(Collections.binarySearch(a, "J"));
	}

}
