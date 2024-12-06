
public class Exceptinexampe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		  String s1 = "abc";
		 System.out.println(s1);
		 int x = 10/0;
		 System.out.println(x);
		  
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	    finally
	    {
	    	System.out.println("hii i am always executed");
	    }
		
		

	}

}
