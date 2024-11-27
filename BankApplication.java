import java.util.*;
class BankInfo
{
	Scanner sc = new Scanner(System.in);
	int acc_no;
	int amt;
	String user;
	String bname;
	void acceptInfo()
	{
		System.out.println("enter acc_no");
		acc_no =sc.nextInt();
		System.out.println("enter amt");
		amt = sc.nextInt();
		System.out.println("enter user");
		user = sc.next();
		System.out.println("enter banme");
		bname = sc.next();
		
	}
	void displayInfo()
	{
		System.out.println(acc_no+user + amt+bname);
	}

	boolean searchano(int an)
	{
		if(acc_no == an)
		{
			return true;
		}else
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

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo ob[] = new BankInfo[2];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< ob.length;i++)
		{
			ob[i] = new BankInfo();
			ob[i].acceptInfo();
			
		}
		for(int i = 0; i< ob.length;i++)
		{
			ob[i].displayInfo();
		}
		
		boolean flag = false;
		System.out.println("enter accno to be searched");
		int searchac = sc.nextInt();
		
		for(int i = 0; i< ob.length;i++)
		{
			flag = ob[i].searchano(searchac);
			if(flag)
			{
				int rb = ob[i].deposit(100);
				//System.out.println(flag);
				System.out.println("remaining balc is :"+rb);
				break;
			}
		}
		if(!flag)
		{
			System.out.println("not found");
		}
		else
		{
		System.out.println("account found");
		}
		
		
		
		
		
		
	}

}
