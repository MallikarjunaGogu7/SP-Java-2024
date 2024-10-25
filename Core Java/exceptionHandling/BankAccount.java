package exceptionHandling;
//user defined exceptions
class InsufficientFundException extends Exception
{
	//param constructor
	public InsufficientFundException(String message)
	{
		super(message);
	}
}
public class BankAccount {

	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws InsufficientFundException
	{
		if(amount>balance)
		{
			throw new InsufficientFundException ("Insufficient funds for this transaction");
			
		}
		else
		{
			balance = balance-amount;
			System.out.println("withdrawal amount is : "+balance);
		}
	}
	
	public static void main(String[] args) throws InsufficientFundException{
		BankAccount ba = new BankAccount(10000);
		ba.withdraw(70000); // 6000 
	}
}
