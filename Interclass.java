
public class Interclass implements Interz,Intery
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Intery ob = new Interclass();
          ob.display();
          Interz ob1 = new Interclass();
          ob1.show();
          ob1.print();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("hello world" + x);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("method of second inetrface");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(" i am interz");
	}

}
