package DaoDemo;

import java.sql.Connection;
import java.util.List;

public class MainDaoPattern {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con = dbcon.getCon();
		EmpDaoDemo ob = new EmpDaoDemo(con);
		EmpDto et = new EmpDto(3,"rohan");
		int j = ob.insertEmp(et);
		System.out.println(j);
		List<EmpDto> l = ob.getAll();
		for(EmpDto x : l)
		{
			System.out.println(x);
		}
		
		EmpDto em = ob.getEmpBYId(2);
		System.out.println("print by id");
		System.out.println(em);

	}

}
