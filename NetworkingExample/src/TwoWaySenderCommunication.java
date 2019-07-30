import java.io.*;
import java.net.*;
public class TwoWaySenderCommunication {
	public static void main(String[] args) {
		try
		{
			Socket s = new Socket("LocalHost",3333);
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str ="" , str1="";
			while(!str.equals("stop"))
			{
				str = br.readLine();
				dout.writeUTF(str);
				dout.flush();
				str1 = din.readUTF();
				System.out.println("Server Says:"+str1);
			}
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
