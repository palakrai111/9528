
public class Cartex extends productin
{
	int quantity;
	void display()
	{
		System.out.println(pid + pname + quantity);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cartex ob = new Cartex();
		ob.pid = 101;
		ob.pname = "tubelight";
		ob.quantity = 5;
		ob.category = "electric";
		System.out.println(ob);
		ob.display();
				

	}

}
