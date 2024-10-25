package methods;

public class Employee {

	public void details()
	{
		String name = "peter";
		int age = 17;
		String department = "Admin";
		String address = "New York, USA";
		
		System.out.println("***Employee details***");
		System.out.println("Employee Name: "+name);
		System.out.println("Employee age: "+age);
		System.out.println("Employee department: "+department);
		System.out.println("Employee address: "+address);	
	}
	
	public double calculateSalary(int salary)
	{
		return salary*12;
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.details();
		System.out.println("The annual salary of employee is: "+emp.calculateSalary(30000));
		
		
		
	}
}
