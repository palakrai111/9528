
public class TheadExample extends Thread
{
	public void run()   // running
	{
		for(int i = 0; i< 5; i++)
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheadExample ob1 = new TheadExample();  // new
		ob1.start();  // Runnable (ready to run)
		ob1.setName("thread1");
		TheadExample ob2 = new TheadExample();
		ob2.start();
		ob2.setName("thread2");
		

	}

}
