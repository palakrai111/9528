
public class StudentCom implements Comparable<StudentCom>
{
	int age;
	String name;
	public StudentCom(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(StudentCom o) {
		// TODO Auto-generated method stub
		if(age == o.age)
		{
			return 0;
		}
		else if(age > o.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	}

	

	
		

