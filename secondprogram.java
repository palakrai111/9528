import java.util.*;

public class secondprogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		//char c = 'A';
       /* for(int i = 0; i<5; i++)
        {char c = 'A';
        	for(int j = 0 ; j<=i;j++)
        	{
        		
        		System.out.print(c);
        		c++;
        		
        	}
        	System.out.println();
        }*/
		
		
		
		 /* int no = 123;
		  int temp = no;
		  int rev = 0;
		  while(temp != 0)
		  {
			  int d = temp % 10;
			  rev = rev*10 + d;
			  temp = temp /10;
			  
		  }
		if(rev == no)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}*/
		
		char c = 'y';
		do {
			System.out.println("enter name");
			String name = sc.next();
			System.out.println(name);
			System.out.println("pess y to contnue and n to dis");
			 c = sc.next().charAt(0);
			if(c == 'n')
			{
				break;
			}
		}while(c == 'y');
		
	}

}
