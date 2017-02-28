package Map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap t=new TreeMap();
		t.put(100, "Rupesh");
		t.put(102, "Mahesh");
		t.put(103, "Govind");
		t.put(101, "Amol");
		//t.put(null, "Raje");
		//t.put("A", "AA");
		System.out.println(t);
	}

}
