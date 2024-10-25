package variable;




public class Demo {
	
	//instance variable
	String name = "peter";
	int age = 19;
	
	//static variable
	static String name2 = "parker";
	static int age2 = 21;
	
	
	 
	 public static void main(String[] args) {
		
		// local variables declared inside main method
		 String schoolName = "harvard uneversity";
		 int id = 17;
		 long mobile = 934563234;
		 float attendence = 75.55f;
		 double present = 80.888;
		 char c = 'a';
		 boolean bool= true;
		 
		 System.out.println("scholl name is:"+schoolName);
		 System.out.println("id:"+id);
		 System.out.println("mobile:"+mobile);
		 System.out.println("attendece:"+attendence);
		 System.out.println("present:"+present);
		 System.out.println("c is:"+c);
		 System.out.println("bool is:"+bool);
		 
		 Demo obj = new Demo();
		 System.out.println(obj.name);
		 System.out.println(obj.age);
		 System.out.println(Demo.name2);
		 System.out.println(Demo.age2);
	}
	

}
