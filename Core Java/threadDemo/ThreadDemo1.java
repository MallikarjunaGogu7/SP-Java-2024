package threadDemo;

public class ThreadDemo1 extends Thread{

	public  void run()
	{
		System.out.println("child thread name :"+Thread.currentThread().getName());
		System.out.println("child priority :"+Thread.currentThread().getPriority());
		
	}
	
	public static void main(String[] args) {
		
		ThreadDemo1 obj1 = new ThreadDemo1();
		ThreadDemo1 obj2 = new ThreadDemo1();
		obj1.setName("peter");
		obj1.setPriority(8);
		obj1.start();
		obj2.start();
		System.out.println("MAIN THREAD Name :"+Thread.currentThread().getName());
		Thread.currentThread().setName("venom");
		System.out.println("after main name:"+Thread.currentThread().getName());
		System.out.println("main priority: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("after main priority: "+Thread.currentThread().getPriority());
	}
}
