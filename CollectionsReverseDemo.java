package UtilityClasses;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseDemo {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(5);
		a.add(2);
		a.add(1);
		a.add(4);
		a.add(3);
		
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
	}

}
