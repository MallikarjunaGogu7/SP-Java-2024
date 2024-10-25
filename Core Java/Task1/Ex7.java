package Task1;
import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number1");
		int n1 = sc.nextInt();
		System.out.println("enter the number2");
		int n2 = sc.nextInt();
		
		int add = n1 + n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		int div = n1 / n2;
		int modulo = n1 % n2;
		
		System.out.println("the addition of "+n1+","+n2+" is :"+add);
		System.out.println("the subtraction of two numbers is: "+sub);
		System.out.println("the multiplication of two numbers is: "+mul);
		System.out.println("the division of two numbers is: "+div);
		System.out.println("the modulo of two numbers is: "+modulo);
	}
}
