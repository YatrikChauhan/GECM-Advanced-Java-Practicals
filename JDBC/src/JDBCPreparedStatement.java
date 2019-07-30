import java.sql.*;
public class JDBCPreparedStatement {

	public static void main(String[] args) {
		try {
		String dname = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bank";
		String query = "insert into account(accname,accno) values (?,?);";
		
		Class.forName(dname);
		Connection con = DriverManager.getConnection(url,"root","yatrik@prince");
		
		PreparedStatement pr = con.prepareStatement(query);
		pr.setString(1, "Parth");
		pr.setDouble(2, 010);
		int a = pr.executeUpdate();
		System.out.print("No.of rows updated:"+a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
