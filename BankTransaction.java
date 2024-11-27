
public class BankTransaction {
	
	
	  int amt = 1000;
	  
	  void withdraw(int a)
	  {
		  //int amt  = 500;
		 amt = amt - a; 
	  }
	  
	  void deposit(int a)
	  {
		  amt = amt + a;
	  }
	  void balc()
	  {
		  System.out.println(amt);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankTransaction ob = new BankTransaction();
		ob.deposit(500);  // 1500
		ob.withdraw(200);  // 1300
		ob.balc();
	}

}
