class Animal
{
	void eat(int x)
	{
		 System.out.println(x*x);
		System.out.println("Animal is eating");
	}
	public static void main(String[] args)
	{
		System.out.println("hello");
	}
	
}
class Dog extends Animal
{
	 void eat(int x)
	{
		System.out.println(x*x*x);
		System.out.println("dog is eating");
	}

}
class Cat extends Animal
{
 void eat(int x)
	{
		System.out.println(x*x*x);
		System.out.println("cat is eating");
	}

}


public class Overridingex extends Animal
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a;
		 a= new Dog123();
		 a.eat(5);
		 a = new Cat();
		 a.eat(5);

	}

}
