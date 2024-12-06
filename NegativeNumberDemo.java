
public class NegativeNumberDemo {
	
	
	
	static void validatNumber(int no) throws NegativeNumberException
	{
		if(no < 0)
		{
			throw new NegativeNumberException("no is lessthan 0");
		}
		else
		{
			System.out.println("no is valid");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		validatNumber(-1);
		}catch(Exception e)
		{System.out.println(e);}
	}

}
