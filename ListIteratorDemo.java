package Cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Rupesh");
		l.add("Shinde");
		l.add("Tanaji");
		System.out.println(l);
		
		ListIterator ltr=l.listIterator();
		
		while(ltr.hasNext()){
			String s=(String)ltr.next();
			
			if(s.equals("Rupesh")){
				ltr.remove();
				//System.out.println(ltr);
			}else if(s.equals("Shinde")){
				ltr.add("Sarkar");
			}
			else if(s.equals("Tanaji")){
				ltr.set("GodFather");
			}
		}
System.out.println(l);
}
}