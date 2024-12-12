import java.util.ArrayList;
import java.util.Collections;

public class Pesonman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> a1 = new ArrayList<Person>();
		Person p1 = new Person(15,"palak");
		Person p2 = new Person(14, "nayan");
		Person p3 = new Person(18,"xyz");
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		//Collections.sort(a1,new AgeComparator());
		Collections.sort(a1,new NameComparator());
		for(Person p : a1)
		{
			System.out.println(p.age + " "+ p.name);
			
		}
		
		

	}

}
