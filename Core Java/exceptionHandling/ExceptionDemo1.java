package exceptionHandling;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			int age[] = new int[4];
			age [4] = 90;
			int marks = 90 / 0;
		}
		
		catch(ArithmeticException are){
			System.out.println("dont enter denominator as zero");
		}
		catch(ArrayIndexOutOfBoundsException arr) {
			System.out.println("index is out of bound");
		}
		catch(NullPointerException Nu){
			System.out.println("cannot find null values");
		}
		catch(NumberFormatException n) {
			System.out.println("cant convert number");
		}
		
		catch(Exception e) {
			System.out.println("enter main error");
		}
		
		finally {
			System.out.println("always executed..");
		}
		System.out.println("remaining 10000 lines of code");
	}
}
