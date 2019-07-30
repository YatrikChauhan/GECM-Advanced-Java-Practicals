import java.net.*;
class URLClassExample {

	public static void main(String[] args) {
		try
		{
			URL u = new URL("https://www.google.com:81//index.html");
			System.out.println("Protocol:"+u.getProtocol());
			System.out.println("Port:"+u.getPort());
			System.out.println("Host Name:"+u.getHost());
			System.out.println("File name:"+u.getFile());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
