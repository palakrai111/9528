import java.sql.*;
public class jdbcdemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
		 String DB_URL = "jdbc:mysql://localhost:3306/student2";
		  String DB_USERNAME = "root";
			 String DB_PASSWORD = "localhost";
			 
			 
			  //loading a driver
			 try {
				 Class.forName(DB_DRIVER);
				 //getting a connection
				Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
				System.out.println("done");
				String query = "select * from sinfo";
				PreparedStatement ps = con.prepareStatement(query);
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt(1) + " " + rs.getString(2));
				}
				
				//preparing staement
				//String query = "insert into sinfo values(?,?)";
				//String query = "delete from sinfo where id =?";
				/*String query = "update sinfo set name = ? where id = ?";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(2,2);
				ps.setString(1,"palak");
				int i =ps.executeUpdate();
				if(i> 0)
				{System.out.println("done");}
				else
				{
					System.out.println("not done");
				}*/
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
	}

}
