package threadDemo;

public class ThreadDemo4 extends Thread{

	public void run()
	{
		for(int i =0; i<10; i++)
		{
			System.out.println("Slid show: "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				//to-do Auto generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		ThreadDemo4 demo = new ThreadDemo4();
		demo.start();
	}
}
