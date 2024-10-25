package methods;

public class Instancedemo {

	public void display()
	{
		System.out.println("i am display meethod");
	}
	public void engine(int rpm)
	{
		System.out.println("this vehcle has speed of: "+rpm+" km/hr");
	}
	public float wheels (int wheels)
	{
		return wheels;
	}
	
	public static void main(String[] args) {
		
		Instancedemo obj = new Instancedemo();
		obj.display();
		obj.engine(330);
		System.out.println("vehcle has the wheels of : "+obj.wheels(4)); // because it is only return statement we have print it
	}
}
