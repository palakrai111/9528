
public class Validateage {
	
	static void validateAge(int age)
	{
		if(age > 18)
		{
		   throw new ArithmeticException("age is not valid");
		}
	}

	public static void main(String[] args) throws ArithmeticException
	{
		// TODO Auto-generated method stub
	try {
		validateAge(19);
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
		e.printStackTrace();
		
	}

	}

}
