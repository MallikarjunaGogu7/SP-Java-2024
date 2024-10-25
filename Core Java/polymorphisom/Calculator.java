package polymorphisom;
// Method Overloading Example
public class Calculator {

	public void addition(int a, int b, int c)
	{
		System.out.println("addition of threee int params:"+(a+b+c));
	}
	
	public void addition(int a, int b)
	{
		System.out.println("addition of two int params: "+(a+b));
	}
	
	public void addition(int a, float b)
	{
		System.out.println("addition of int and float params: "+(a+b));
	}
	
	public void addition(float a, float b)
	{
		System.out.println("addition of two float params: "+(a+b));
	}
	
	public void addition(float a, int b)
	{
		System.out.println("addition of float and int params: "+(a+b));
	}
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		obj.addition(3,  44.6f);
	}
}
