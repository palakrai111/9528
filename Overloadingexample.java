
public class Overloadingexample {

	void add(int a, int b) 
	{
		System.out.println(a+b);
	}
	void add(String x,String y )
	{
	System.out.println(x+y);	
	}
	public static void main(String y)
	{
		System.out.println("i am not main method" + y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloadingexample ob = new Overloadingexample();
		ob.add(1, 2);
		ob.add("palak","Rai");
		main("Rai");
	}

}
