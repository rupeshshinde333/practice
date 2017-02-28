package UtilityClasses;

import java.util.Arrays;

public class ArraysSortDemo {

	public static void main(String[] args) {
		int[] a={10,5,20,11,6};
		System.out.println("Primitive Arrays Before Sorting: ");
		for(int a1:a){
			System.out.print(a1+" " );
		}
		Arrays.sort(a);
		System.out.println(  "   ");
		System.out.println("Primitive Arrays After Sorting: ");
		for(int a1:a){
			System.out.print(a1+" " );
		}
		
		
		System.out.println(  "   ");
		
		String[] s={"A","Z","B"};
		System.out.println("String Arrays Before Sorting: ");
		for(String a1:s){
			System.out.print(a1+" " );
		}
		Arrays.sort(s);
		System.out.println(  "   ");
		System.out.println("String Arrays After Sorting: ");
		for(String a1:s){
			System.out.print(a1+" " );
		}
	}

}
