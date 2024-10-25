package thisSuperFinal;

class SuperDemo{

	int salary = 50_000;
	
	public void getSalary(int salary)
	{
		salary = 60_000;
		System.out.println("my parent salary is: "+salary);
	}
}


public class ThisKey extends SuperDemo{

	int salary = 20_000; //global
	
	public void getSalary(int salary)
	{
		salary = 30_000; //local
		System.out.println("my salary is: "+salary);
		System.out.println("my global salary is : "+this.salary);
		System.out.println("my parent salary is : "+super.salary);
		
	}
	
	public static void main(String[] args) {
		ThisKey obj = new ThisKey();
		obj.getSalary(40_000);
	}
}
