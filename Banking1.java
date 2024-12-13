package com.sp.multithreadingexamples;

public class Banking1 extends Thread 
{
	BankingTransaction b;
	Banking1(BankingTransaction b)
	{
		this.b = b;
	}
	public void run()
	{
		b.withdraw(1500);
	}
    
}
