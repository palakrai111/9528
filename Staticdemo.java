
public class Staticdemo {
	
	static String name = "abc";
	static
	{
		System.out.println("hello wrld");
	}
	static void display()
	{
		System.out.println("palak");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     display();
     System.out.println("mainmethod");
		//Staticdemo.display();
	}

}
