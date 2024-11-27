
public class Encapexample {

	private int id ;
	private String name;
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapexample ob = new Encapexample();
		ob.setId(5);
		System.out.println(ob.getId());
		ob.setName("palak");
		System.out.println(ob.getName());

	}

}
