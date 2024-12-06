import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentX> a1 = new ArrayList<StudentX>();
		StudentX ob1 = new StudentX(1,"palak");
		StudentX ob2 = new StudentX(2,"nayan");
		StudentX ob3 = new StudentX(3,"raza");
		a1.add(ob1);
		a1.add(ob2);
		a1.add(ob3);
		for(StudentX s : a1)
		{
			System.out.println(s.id + " " + s.name);
		}
		

	}

}
