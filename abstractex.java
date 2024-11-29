abstract class abstractex1
{
	int x;
	abstractex1(int x)
	{
		this.x = x;
		System.out.println("hello world" + x);
	}
  abstract void show();
	void display()
	{
		System.out.println("hello world ");
	}

}
class abstractex2 extends abstractex1
{
	abstractex2(int x)
	{
		super(x);
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("i am inside show" + x);
	}
	
}
public class abstractex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractex1 ob = new abstractex2(5);
		ob.show();
	}

}
