package exceptionHandling;

class AgeNotValidException extends Exception{
	
	public AgeNotValidException(String message) {
		super(message);
	}
}


public class AgeValidator {

	public void validateAge(int age) throws AgeNotValidException
	{
		if(age<18)
		{
		    throw new AgeNotValidException("age must be 18 or older");
		}else
		{
			System.out.println("age is valid");
		}
	}
	
	public static void main(String[] args) throws AgeNotValidException {
		
		AgeValidator av = new AgeValidator();
		av.validateAge(22);
		System.out.println("remaining 1000 lines code");
	}
}


