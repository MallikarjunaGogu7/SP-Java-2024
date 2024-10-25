package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo3 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(3);
		al.add(2);
		al.add(9);
		al.add(7);
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(5);
		al.add(6);
		
		System.out.println("normal list: "+al);
		Collections.sort(al);
		System.out.println("sorted: "+al);
		
		Collections.reverse(al);
		System.out.println("reversed: "+al);
		
		Collections.shuffle(al);
		System.out.println("shuffled: "+al);
		
		ArrayList al1 = new ArrayList();
		al1.add('a');
		al1.add('b');
		al1.add('c');
		al1.add('d');
		al1.add('e');
		al1.add('f');
		
		System.out.println("first arrayList: "+al);
		System.out.println("second arrayList: "+al1);
		
		//conversion of arrayList to array
		Object[] obj = al1.toArray();
		
		for(Object ol:obj) {
			System.out.print(ol+" ");
		}
		
//		al.addAll(al1);
//		System.out.println("new List :"+al);
		
//		Collections.copy(al, al1);
//		System.out.println(al);
		
		//for each loop
		
		
		for(Object odd:al)
		{
			int oddVal = (int) odd; 
			if(oddVal%2 !=0)
				System.out.print(oddVal+" ");
		}
	}
}
