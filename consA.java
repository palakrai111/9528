
public class consA {
     int x;
     int y;
	consA(int y)
	{
		this.y = y;
		System.out.println("hello" + y);
	}
	consA(int y, int x)
	{
		this(y);
		this.x = x;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consA ob = new consA(5,6);
	}

}
