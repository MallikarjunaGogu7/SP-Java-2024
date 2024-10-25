package ScannerEx;
import java.util.Scanner;

public class UserIn {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter username..");
		String uname  = sc.next();
		System.out.println("enter password..");
		String psw = sc.next();
		System.out.println("enter age..");
		int age = sc.nextInt();
		System.out.println("enter salary");
		double salary = sc.nextDouble();
	    System.out.println("enter a bonus ");
	    float bonus = sc.nextFloat();
	    System.out.println("enter a yes or no");
	    boolean bool = sc.nextBoolean();
	    
	    System.out.println(uname +" "+psw+" "+age+" "+salary+" "+bonus+" "+bool);
	}
}
