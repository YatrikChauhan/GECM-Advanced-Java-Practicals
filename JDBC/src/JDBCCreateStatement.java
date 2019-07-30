import java.sql.*;
public class JDBCCreateStatement {

	public static void main(String[] args) {
		try {
		String dname = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bank";
		String query = "insert into account(accname,accno) values ('Dhruvin','058');";
		
		Class.forName(dname);
		Connection con = DriverManager.getConnection(url,"root","yatrik@prince");
		
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		System.out.print("No. of rows updated:"+count);
		}
		catch(Exception e)
		{
			System.out.print("\n"+e);
		}
	}

}
