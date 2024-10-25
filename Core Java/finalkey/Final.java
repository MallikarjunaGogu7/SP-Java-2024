package finalkey;

class ParentFinal
{
	int age = 99;
	public void getAge(int age)
	{
		this.age = ++age;
		System.out.println("my parent age is : "+this.age);
	}
}

// child class

public class Final extends ParentFinal{

	public void getAge(int age) //88
	{
		this.age = --age;//87
		System.out.println("my age is : "+this.age);
	}
	
	public static void main(String[] args) {
		Final obj = new Final();
		obj.getAge(88);
		//87 88 89 99 100
	}
}
