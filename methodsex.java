
public class methodsex {
	
	int amt = 1000;   // pass array
	                  // max of two nos
	int withdraw(int a)
	{
		amt = amt - a;
		return 0;
	}
	void deposit(int a)
	{
		amt = amt + a;
		
	}
	void bal()
	{
		System.out.println(amt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodsex ob = new methodsex();
		ob.withdraw(200);
		ob.deposit(500);
		ob.bal();
		
		

	}

}
