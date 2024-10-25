package exceptionHandling;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		try {
			int num[] = new int[7];
			num[6] = 654 / 10;      // code run from right side first
			String s = "sathya"; //"sathya", "786"
			System.out.println(s.length());
			int x = Integer.parseInt(s);
			System.out.println("no error : " + x +" " + s);
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index is out of bound exc");
			
		}
		catch(NullPointerException e) {
			System.out.println("cant find out length of the null");
		}
		catch(NumberFormatException e) {
			System.out.println("String cant convert to number");
		}
		catch(ArithmeticException e) {
			System.out.println("Dont enter denominator as zero");
		}
		
		catch(Exception e) {
			System.out.println("enter main error");
		}
		finally {
			System.out.println("always executed");
		}
		System.out.println(" other 1000 lines of code");
	}
}
