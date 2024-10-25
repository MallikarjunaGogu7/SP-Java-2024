package threadDemo;



public class ThreadDemo2 extends Thread{
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("I am Thanos"); // thanos waiting until exicuting of iron man
			Thread.yield();
		}
	}
	
	public static void main(String[] args) {
		
		ThreadDemo2 demo = new ThreadDemo2();
		
		demo.start();
		
		for(int i=0; i<10; i++)
		{
			System.out.println("I am Iron Man");
		}
	}
	
}
