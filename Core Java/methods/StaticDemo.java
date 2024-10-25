package methods;

public class StaticDemo {

	public static void movie()  // static method without parameters and without return type
	{
		System.out.println("movie name is: deadpool");
	}
	public static void tickets(int tickets)  // static method with parameters and without return type
	{
		System.out.println("tickets booked is: "+tickets);
	}
	public static String review(String review)  // static method with return type and with return type
	{
		return review;
	}
	
	public static void main(String[] args) {
		
		StaticDemo.movie();
		StaticDemo.tickets(4);
		System.out.println(StaticDemo.review("super hit"));
		
	}
}
