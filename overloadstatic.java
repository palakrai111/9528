
public class overloadstatic {
	static void add(int a, int b)
	{
		int z = a+b;
		System.out.println(z);
	}
	
	static void add(int a, int b, int c)
	{
		int x = a+ b+c;
		System.out.println(x);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(2,3);
		add(2,3,4);

	}

}
