
import java.util.*;
public class arrayoned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*Random r = new Random();
       int a[] = new int[3];
       System.out.println("enter elements");
		for(int i = 0 ; i <a.length;i++ )
		{
		//	a[i]= sc.nextInt();
			a[i] = r.nextInt(1, 10);
		}
		for(int i = 0 ; i <a.length;i++ )
		{
            System.out.println(a[i]);
		}*/
		
		int a[] = {2,3,4,5,1};  // 12345
		int no = 6;
		int search = 16;
		// 5 , 1
		// 2,4
	   for(int i = 0 ; i < a.length -1; i++)
		{
			for(int j = i+1 ; j< a.length; j++)
			{
				if(a[i]+ a[j] == no)
				{
					System.out.println(a[i] + " "+ a[j]);
				}
			}
		}
		
		//searching
	   boolean flag = false;
	   for(int i = 0 ; i < a.length; i++)
	   {
		   if(a[i] == search)
		   {
			   flag = true;
			   break;
			   
		   }
	   }
	   if(flag)
	   {
		   System.out.println("element found ");
	   }
	   else
	   {
		   System.out.println("not found");
	   }
	   // max and min
	   System.out.println("min and max");
	   int min  = a[0];
	   int max = a[0];
	   for(int i = 0 ; i < a.length; i++)
	   {
		   if(a[i]> max)
		   {
			   max = a[i];
		   }
		   if(a[i]< min)
		   {
			   min = a[i];
		   }
	   }
	   System.out.println("max"+max);
	   System.out.println("min"+min);
	   
	  // 2 d array
	   Arrays.sort(a);
	   for(int i = 0 ; i < a.length; i++)
	   {
		   System.out.println(a[i]);
	   }
	   
	   
	   // {2,3,4,5,1};  // 12345 -> 54321
	   int no1 = a[a.length-1];
	  for(int i = 3 ; i>= 0; i--)
	  {
	   no1 = no1*10 + a[i];
	  }
	   System.out.println(no1);
	   
	   
	   // 2 d array
	  int a2d[][] = new int[3][3]; 
	  System.out.println("enter elements");
	   for(int i = 0 ; i< 3; i++)
	   {
		   for(int j = 0 ; j< 3; j++)
		   {
			   a2d[i][j] =sc.nextInt();
		   }
		   
	   }
	   int sum = 0;
	   
	   for(int i = 0 ; i< 3; i++)
	   {
		   for(int j = 0 ; j< 3; j++)
		   {
			   //System.out.print(a2d[i][j]+ " ");
			   sum = sum + a2d[i][j];
			   
		   }
		//System.out.println();   
	   }
	  System.out.println(sum); 
	  
	
	  
	  
	  
	}

}
