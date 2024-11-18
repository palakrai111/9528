import java.util.*;
public class Armstrongnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		//armstrong no
		/*int no = 152;
		int temp = no;
		double sum =0;
		while(temp != 0)
		{
			int d = temp%10;
			sum = sum + Math.pow(d,3);
			temp = temp /10;
		}
		System.out.println(sum);
       if (sum == no)
       {System.out.println("armstrong");}
       else
       {System.out.println("not armstrong");}*/
		// prime number
	/*	int no = 15;
		int count = 0;
		for(int i = 1 ; i <=no; i++)
		{
			if(no%i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println("it is a prime no");
		}
		else
		{
			System.out.println("it is not a prime no");
		}*/
		
		//fibonacci
		/*int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1 + " "+ n2 + " ");
		for(int i =0 ; i< 10; i++)
		{
			n3 = n1+n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2  = n3;
			
		}*/
		// pyramids
		/*char c = 'A';
		for(int i = 0; i< 5 ; i++)
		{
			for(int j = 5; j>i ; j--)
			{System.out.print(c);
				c++;
				
			}
			System.out.println();
		}*/
		/*char c = 'y';
		do
		{
			System.out.println("enter name");
			String name = sc.next();
			System.out.println("enter age");
			int age = sc.nextInt();
			System.out.println("if you want to continue press y else n");
			c = sc.next().charAt(0);
			if(c == 'n')
			{
				break;
			}
		}while(c == 'y');*/
		
		/*int x = 15;
		double d ;
		d = x;
		System.out.println("converting int into double"+d);
		
		double d1 = 18.678;
		int y;
		y = (int)d1;
		System.out.println("converting double into int"+y);
		
		int l = 65;
		char c = (char)l;
		System.out.println(c);*/
		
		
		/*int a[] = {10,20,30,40}; //{0,1,2,3}
		for(int i = 0; i<=a.length-1;i++)//{4-1}
		{
			System.out.println(a[i]); // a[0] = 10;
		}
		
		for(int x:a)
		{
			System.out.println(x);
		}*/
		Random r = new Random();
		int arr[] = new int[3];
		for(int i = 0; i < arr.length;i++)
		{
			
			arr[i] = r.nextInt(999999);
		}
		for(int i = 0; i < arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		int x[] = {6,8,3,2,1,9};
		/*Arrays.sort(x);
		for(int y : x)
		{
			System.out.println(y); // 1 ,2 3 , 6, 8, 9
		}
		int num = x[5];
		for(int y = 4; y>=0;y--)
		{
			 num = num * 10 + x[y];
		}
		
		System.out.println(num);*/
	}

}
