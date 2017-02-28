package List;

import java.util.ArrayList;

public class ArrayListt {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("A");
		a.add(1);
		a.add(null);
		a.add("A");
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
		a.add(2, "M");
		a.add(12);
		System.out.println(a);
	}

}
