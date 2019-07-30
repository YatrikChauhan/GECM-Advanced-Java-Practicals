import java.io.*;
import java.net.*;
public class ServerReverse {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(4444);
		int count = 1;
		while(true)
		{
			new RevThread(ss.accept(),count).start();
			System.out.println("client "+count+" connected");
			count++;
		}
	}
}
class RevThread extends Thread
{
	Socket s = null;
	int n;
	public RevThread(Socket socket,int count)
	{
		s=socket;
		n=count;
	}
	public void run()
	{
		try {
			while(true)
			{
				DataInputStream din = new DataInputStream(s.getInputStream());
				DataOutputStream dout = new DataOutputStream(s.getOutputStream());
				String str = din.readUTF();
				StringBuffer rev = new StringBuffer();
			    rev = rev.append(str);
			    rev = rev.reverse();
			    String revStr = new String(rev);
			    dout.writeUTF(revStr);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
