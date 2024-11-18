import java.util.Scanner;
public class Firstprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*System.out.println("enter first");
		int x = sc.nextInt();
		System.out.println("enter second");
		int y = sc.nextInt();
		System.out.println(x+y);*/

/*		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++); // 10
		System.out.println(++a); //12
		System.out.println(a--);//12
		System.out.println(--a);//10
		
		if(b>a || b> c)
		{
			System.out.println("exceuted");
		}
		int x = 8 >> 2; // 1000 // 10 // 2
		System.out.println("right shift"+x);
		int y = 8 << 2; // 1000 // 100000 // 32
		System.out.println("left shift"+y);
		
		
		int z = 8 & 9 ; //1000   1001 //1000 // 8
		System.out.println("bitwise and"+ z);
		int v = 8 | 9 ; //1000   1001 //1001
		System.out.println("bitwise or"+ v);
		
		int h = 12;
		int k = 13;
		boolean b1 = (k>h)? true : false;
		System.out.println("ternary"+ b1); */
		
		
		for(int k =0; k<5; k++)
		{
			for(int h = 5; h>k;h--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
