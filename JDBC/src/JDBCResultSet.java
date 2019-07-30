import java.sql.*;
public class JDBCResultSet {

	public static void main(String[] args) {
		try {
		String dname = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bank";
		String query = "select * from account;";
		
		Class.forName(dname);
		Connection con = DriverManager.getConnection(url,"root","yatrik@prince");
		
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
			String name = rs.getString("accname");
			int no = rs.getInt("accno");
			System.out.println(name+"\t"+no);
		}
		
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}

}
