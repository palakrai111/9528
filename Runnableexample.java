package com.sp.multithreadingexamples;

public class Runnableexample implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i< 10;i++)
		{
			System.out.println(Thread.currentThread().getName() + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	public static void main(String[] args)
	{
		Runnableexample ob1 = new Runnableexample();
		Thread t1 = new Thread(ob1);
		t1.setName("thread1");
		t1.start();
		
		Runnableexample ob2 = new Runnableexample();
		Thread t2 = new Thread(ob2);
		t2.setName("thread2");
		t2.start();
		
	}

}
