package com.sp.multithreadingexamples;

public class Banking2 extends Thread 
{
	BankingTransaction b;
	Banking2(BankingTransaction b)
	{
		this.b = b;
	}
	public void run()
	{
		b.deposit(1000);
	}
    
}
