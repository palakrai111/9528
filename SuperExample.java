class super1
{
	//String color = "black";
	int id;
	String name;
	super1(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	void show()
	{
		System.out.println("hello world");
	}
}
class super2 extends super1
{
	int age;
	super2(int id,String name,int age)
	{
		super(id,name);
		this.age = age;
	}
	public void display()
	{
		System.out.println(id + name + age);
		super.show();
		String color  = "red";
		System.out.println(color);
		//System.out.println(super.color);
		
	}
}
public class SuperExample 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		super2 ob = new super2(1,"palak",15);
		ob.display();
	}

}
