package polymorphisom;

// Method Override example

class SriniParents
{
	public void property()
	{
		System.out.println("1000 acres property");
	}
	
	public void marriage()
	{
		System.out.println("arrange marriage");
	}
}

public class Srinivas extends SriniParents{

	public void marriage()
	{
		System.out.println("love marriage");
		//Super.marriage();
	}
	
	public static void main(String[] args) {
		
		Srinivas obj = new Srinivas();
		obj.property();
		obj.marriage();
	}
}

