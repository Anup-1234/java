package M17_CollectionArrayList;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList e = new ArrayList();
		e.add(10);
		e.add(20);
		e.add("anup");
		e.add("anup");
		e.add(10);
		
		System.out.println(e);
		
		System.out.println(e.get(2));
		
		System.out.println("===========================");
		System.out.println(e.size());
		
		//System.out.println(e.get(250));   //exception 
		
		System.out.println("===========================");
		
		System.out.println(e.contains(3));
		System.out.println(e.contains("anup"));
		System.out.println(e.contains(10));
		
		System.out.println("===========================");
		
		System.out.println(e.isEmpty());
//		e.clear();
//		System.out.println(e.isEmpty());
//		System.out.println(e);
		
		System.out.println("===========================");
		
		ArrayList a = new ArrayList();
		a.add(220);
		a.add(330);
		a.add("kalyane");
		a.add("kalyane");
		a.add(10);
		
		System.out.println(a);
		
		System.out.println(a.indexOf(330));
		System.out.println(a.indexOf("kalyane"));
		System.out.println(a.lastIndexOf("kalyane"));
	}

}
