package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put("Rupesh", 700);
		h.put("Amol",800);
		h.put("Mahesh", 200);
		h.put("Govind", 500);
		System.out.println(h);
		System.out.println(h.put("Rupesh", 1000));
		Set s=h.keySet();
		System.out.println(s);
		Collection c=h.values();
		System.out.println(c);
		Set s1=h.entrySet();
		System.out.println(s1);
		
		
		
		
	}

}
