
public class Emloyee {
	
	
	int eid;
	String name;
	Address a;
	
	public Emloyee(int eid, String name, Address a) {
		super();
		this.eid = eid;
		this.name = name;
		this.a = a;
	}

  void display()
  {
	 // a.show();
	  System.out.println(eid + " "+ name+a.state);
  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1 = new Address(1,"vizag","AP");
		Address a2 = new Address(2,"vijaywada","AP");
		Emloyee e1 = new Emloyee(1,"palak",a1);
		Emloyee e2 = new Emloyee(1,"nayan",a2);
		e1.display();
		e2.display();
		

	}

}
