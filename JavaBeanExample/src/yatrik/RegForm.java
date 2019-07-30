package yatrik;
public class RegForm implements java.io.Serializable {
	private String uname,password;
	private double phone;
	
	public void setuname(String s) {uname=s;}
	public void setphone(double s) {phone=s;}
	public void setpassword(String s) {password=s;}
	
	public String getuname() {return uname;}
	public double getphone() {return phone;}
	public String getpassword() {return password;}
}
