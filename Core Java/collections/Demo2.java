package collections;
import java.util.ArrayList;
public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(34);
		al.add(true);
		al.add("peter");
		al.add("welcome");
		al.add(null);
		al.add(90.99);
		al.add(false);
		al.add(45);
		al.add("peter");
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains(45));
		System.out.println(al.set(2,"tony"));
		System.out.println(al.get(2));
		System.out.println(al.remove(4));
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.set(1, "peter"));
		System.out.println(al.indexOf("peter"));
		System.out.println(al.lastIndexOf("peter"));
		System.out.println(al.subList(1,4 ));
	}
}
