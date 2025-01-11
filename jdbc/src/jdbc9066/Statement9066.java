package jdbc9066;
import java.sql.*;
public class Statement9066 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
				 String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
				 String DB_URL = "jdbc:mysql://localhost:3306/studentmanagement";
				 String DB_USERNAME = "root";
					 String DB_PASSWORD = "localhost";
					 
					 Class.forName(DB_DRIVER);
						Connection con = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD );
						Statement s = con.createStatement();
					/*	String query1 = "insert into student values(400,'kkk','cse','pass')";
						int i = s.executeUpdate(query1);
						if(i>0)
						{System.out.println("done");}
						else {System.out.println("not done");}*/
						
						ResultSet rs = s.executeQuery("select * from student");
						while(rs.next())
						{
						System.out.println(rs.getInt(1)+ " "+rs.getString(2)+rs.getString(3)+rs.getString(4));	
						}
						
						
						con.close();

	}

}
