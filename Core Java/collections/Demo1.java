package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Demo1 {

	public static void main(String[] args) {
		
//		ArrayList al = new ArrayList();
//		LinkedList al = new LinkedList();
		Vector al = new Vector();
		
		
		System.out.println("before size: "+al.size()); //10
		System.out.println("before capacity: "+al.capacity());//10
		al.add(34);
		al.add("peter");
		al.add("tony");
		al.add(true);
		al.add("peter");
		al.add(99);
		al.add(89.90);
		al.add(null);
		al.add(45);
		al.add("peter");
		// 11th values
		al.add("malli"); 
		
		System.out.println("after size: "+al.size());
		System.out.println("after capacity: "+al.capacity());
	}
}
