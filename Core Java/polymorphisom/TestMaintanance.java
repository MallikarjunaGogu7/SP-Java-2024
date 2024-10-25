package polymorphisom;

class Vehcle
{
	String model;
	double basicPackage;
	
	public Vehcle(String model, double basicPackage)
	{
		this.model = model;
		this.basicPackage = basicPackage;
	}
	
	public double costOfMaintanance()
	{
		System.out.println(this.model);
		return basicPackage*0.5;
	}
}

class Car extends Vehcle
{
	public Car(String model, double basicPackage)
	{
		super(model, basicPackage);
	}
	
	public double costOfMaintanance()
	{
		System.out.println("car model is:"+this.model);
		return basicPackage*0.10;
	}
	
}

class Truck extends Vehcle
{
	public Truck(String model, double basicPackage)
	{
		super(model, basicPackage);
	}
	
	public double costOfMaintanance()
	{
		System.out.println("Truck model is:"+this.model);
		return basicPackage*0.15;
	}
}

class Bike extends Vehcle
{
	public Bike(String model, double basicPackage)
	{
		super(model, basicPackage);
	}
	
	public double costOfMaintanance()
	{
		System.out.println("Bike model is :"+ this.model);
		return basicPackage*0.20;
	}
}
public class TestMaintanance {

	public static void main(String[] args) {
		
		Vehcle car = new Car("volksWagon", 2000);
		Vehcle truck = new Truck("bharatBenx", 30000);
		Vehcle bike = new Bike("Yamaha", 1000);
		
		System.out.println("Car maintanace: "+car.costOfMaintanance());
		System.out.println("Truck maintanace: "+truck.costOfMaintanance());
		System.out.println("Bike maintanace: "+bike.costOfMaintanance());
	}
}














