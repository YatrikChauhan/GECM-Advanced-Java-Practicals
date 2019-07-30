import java.sql.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AuthenticateBean {
	private String username;
	private String password;
	private String dbusername;
	private String dbpassword;
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getDbusername() {
		return dbusername;
	}
	public String getDbpassword() {
		return dbpassword;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setDbusername(String dbusername) {
		this.dbusername = dbusername;
	}
	public void setDbpassword(String dbpassword) {
		this.dbpassword = dbpassword;
	}
	public void check(String username)
	{
		try {
		String dname = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/login";
		Class.forName(dname);
		Connection con = DriverManager.getConnection(url,"root","yatrik@prince");
		String query = "select * from data where name='"+username+"'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		dbusername = rs.getString(1).toString();
		dbpassword = rs.getString(2).toString();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
	public String validate()
	{
		check(username);
		if(username.equalsIgnoreCase(dbusername))
		{
			if(password.equalsIgnoreCase(dbpassword))
			{
				return "success";
			}
			else
			{
				return "failure";
			}
		}
		else
		{
			return "failure";
		}
	}
}
