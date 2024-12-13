package com.sp.multithreadingexamples;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingTransaction ob = new BankingTransaction();
		Banking1 b1 = new Banking1(ob);
		Banking2 b2 = new Banking2(ob);
		b1.start();
		b2.start();
		
	}

}
