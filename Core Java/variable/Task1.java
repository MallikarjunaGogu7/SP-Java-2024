package variable;

public class Task1 {
	String name = "iron man";
	static int age = 17;
	
	public static void main(String[] args) {
		
		Task1 obj = new Task1();
		System.out.println("tony stark is : "+obj.name);
		System.out.println("tony age is: "+Task1.age);
	}
}
