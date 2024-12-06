
public class Exceptionexamples {
	public static void main(String[] args)
	{
		//int arr[] = new arr[3];
		int x[] = {1,2,3,4};
		
		System.out.println("welcome");
		try {
			/*int a = 10/0;
			 x[4] = 5;
			   
			   System.out.println(x[4]);
			System.out.println("helo world");*/
		
		  /*String s = null;
		  System.out.println(s.length());*/
		  String s1 = "abc";
		  int i = Integer.parseInt(s1);
		  System.out.println(i);
		  
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		/*catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		}*/
		
		
	}

}
//ArithmeticException
//ArrayIndexOutOfBoundsException