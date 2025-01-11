package DaoDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDaoDemo implements EMPService1
{
	Connection con;

	EmpDaoDemo(Connection con)
	{
		this.con = con;
	}
	@Override
	public int insertEmp(EmpDto e) 
	{
		int i = 0;
		String query = "insert into emp2 values(?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,e.getId());
			ps.setString(2,e.getName());
			 i = ps.executeUpdate();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return i;
	}
	@Override
	public List<EmpDto> getAll() {
		// TODO Auto-generated method stub
		EmpDto dt = null;
		List<EmpDto> l = new ArrayList<EmpDto>();
		String query = "select * from emp2";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				int eid = rs.getInt(1);
				String ename = rs.getString(2);
				dt = new EmpDto(eid,ename);
				l.add(dt);
			}
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		return l;
	}
	@Override
	public EmpDto getEmpBYId(int id) {
		// TODO Auto-generated method stub
		EmpDto dt = null;
		
		String query = "select * from emp2 where id = ?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				int eid = rs.getInt(1);
				String ename = rs.getString(2);
				dt = new EmpDto(eid,ename);
				
			}
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		return dt;
		
		
		
		
	}
	
	
	
	

}
