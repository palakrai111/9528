
public class Dog123 extends Animal1
{
     void eat()
     {
    	 System.out.println("dog is eating");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Dog123 a = new Dog123();
		a.eat();
		a.show();
		Animal1 a1 = new Animal1();
		Dog123 b = (Dog123)a1;
		b.eat();
		b.show();
		

	}

}
