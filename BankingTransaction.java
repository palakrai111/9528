package com.sp.multithreadingexamples;

public class BankingTransaction 
{
     int amt = 1000;
	synchronized void withdraw(int a)
	{
		if(amt < a)
		{
			System.out.println("insufficient balance");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("amt withdrawn");
		amt = amt -a;
		System.out.println("remaining balc"+amt);
	}
	synchronized void deposit(int a)
	{
		
		
		amt = amt + a;
		
		System.out.println("deposited"+amt);
		notify();
	}
	
	
	
	
}
