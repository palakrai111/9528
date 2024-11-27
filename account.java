import java.util.*;
class BankDetails
{
	int amt;
	int acno;
	String cname;
	String bname;
	Scanner sc = new Scanner(System.in);
	void acceptinfo()
	{
		amt = sc.nextInt();
		acno = sc.nextInt();
		cname = sc.next();
		bname = sc.next();
	}
	void displayinfo()
	{
		System.out.println(acno + cname + bname);
	}
     boolean searchac(int an)
     {
    	 if(acno == an)
    	 {
    		 return true;
    	 }
    	 else
    	 {
    	return false; 
    	 }
     }
     int withdraw(int a)
 	{
 		amt = amt - a;
 		return amt;
 	}
     
     int deposit(int a)
  	{
  		amt = amt + a;
  		return amt;
  	}

}
public class account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BankDetails ob[] = new BankDetails[2];
		
		for(int i = 0; i < 2; i++)
		{
			ob[i] = new BankDetails();
			ob[i].acceptinfo();
		}
		for(int i = 0; i < 2; i++)
		{
			ob[i].displayinfo();
		}
		boolean found = false ;
		int x = 0;
		int y = 0;
		System.out.println("enter ac to withdraw");
		x = sc.nextInt();
		System.out.println("enter ac to deposit");
		y = sc.nextInt();
		
		for(int i = 0; i < 2; i++)
		{
			found =ob[i].searchac(x);
			//System.out.println(found);
			if(found)
			{
				int amt =ob[i].withdraw(500);
				System.out.println("rb after withdraw"+amt);
				break;
			}
			
		}
		
		for(int i = 0; i < 2; i++)
		{
			found =ob[i].searchac(y);
			//System.out.println(found);
			if(found)
			{
				int amt =ob[i].deposit(400);
				System.out.println("rb after deposit"+amt);
				break;
			}
			
		}
		
		
		
		System.out.println("acfound");
	}

}
