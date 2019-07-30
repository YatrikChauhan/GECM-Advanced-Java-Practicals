import java.io.*;
import java.net.*;
public class TwoWayRecieverCommunication {

	public static void main(String[] args) {
		try
		{
			ServerSocket ss = new ServerSocket(3333);
			Socket s = ss.accept();
			DataInputStream din = new DataInputStream(s.getInputStream());
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str ="" , str1 = "";
			while(!str.equals("stop"))
			{
				str = din.readUTF();
				System.out.println("Client says:"+str);
				str1 = br.readLine();
				dout.writeUTF(str1);
				dout.flush();
			}
			s.close();
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
