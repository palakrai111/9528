
public class Testingexception {
	
	static void invalidage(int age) throws InvalidAgeException
	{
		if(age > 18)
		{
			throw new InvalidAgeException("age not valid");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 invalidage(19);
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
