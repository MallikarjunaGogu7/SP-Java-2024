package threadDemo;

public class ThreadDemo3 extends Thread {

	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("I am Iron-man Thread");
			try {
				Thread.sleep(3000);
			}catch (InterruptedException e) {
				// To-Do auto generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		ThreadDemo3 demo = new ThreadDemo3();
		demo.start();
		//demo.join();
		demo.join(12000);
		
		for(int i=0; i<10; i++)
		{
			System.out.println("I am Thanos");
		}
		
	}
}
