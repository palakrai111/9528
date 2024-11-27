
public class constructoex {
	int id;
	String name;
	int sal;
	constructoex(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	constructoex(int id, String name,int sal)
	{
		this(id,name);
		this.sal = sal;
	}
	public String toString()
	{
		return id + name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructoex ob = new constructoex(5,"palak",100);
		System.out.println(ob);
	}

}
