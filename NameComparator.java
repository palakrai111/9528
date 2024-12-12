import java.util.Comparator;

public class NameComparator implements Comparator<Person>
{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
		
	}

}
