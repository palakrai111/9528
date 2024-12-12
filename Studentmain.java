import java.util.ArrayList;
import java.util.Collections;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentCom> a1 = new ArrayList<StudentCom>();
		StudentCom ob1 = new StudentCom(20,"palak");
		StudentCom ob2 = new StudentCom(2,"nayan");
		StudentCom ob3 = new StudentCom(30,"xyz");
		a1.add(ob1);
		a1.add(ob2);
		a1.add(ob3);
		Collections.sort(a1);
      for(StudentCom x : a1)
      {
    	  System.out.println(x.age + " " + x.name);
      }
	}

}
