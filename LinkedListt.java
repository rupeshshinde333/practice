package List;

import java.util.LinkedList;

public class LinkedListt {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Rupesh");
		l.add(33);
		l.add(null);
		l.add("Rupesh");
		System.out.println(l);
		l.set(0, "Shinde");
		System.out.println(l);
		l.add(0 , "Rupesh");
		l.removeLast();
		System.out.println(l);
	}

}
