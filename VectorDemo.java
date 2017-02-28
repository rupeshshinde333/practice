package List;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement(1);
		v.addElement("R");
		v.addElement(null);
		System.out.println(v);
		
		v.add(0,"Rupesh");
		System.out.println(v);
		v.clear();
		System.out.println(v);
		System.out.println(v.capacity());
	}

}
