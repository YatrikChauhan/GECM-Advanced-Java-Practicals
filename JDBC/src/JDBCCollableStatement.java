import java.sql.*;
public class JDBCCollableStatement {

	public static void main(String[] args) {
		try {
			String dname = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/bank";
			
			Class.forName(dname);
			Connection con = DriverManager.getConnection(url,"root","yatrik@prince");
			
			CallableStatement cl = con.prepareCall("{call personal(?,?,?,?)}");
			cl.setInt("roll_no", 102);
			cl.setString("Name", "Yatrik");
			cl.setString("surname", "Chauhan");
			cl.setDouble("phone",100220);
			cl.execute();
			System.out.print("Details entered:");
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}

}
