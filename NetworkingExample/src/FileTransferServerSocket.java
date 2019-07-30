import java.io.*;
import java.net.*;
import java.util.*;
public class FileTransferServerSocket {
	public static void main(String[] args) {
		try
		{
			ServerSocket ss = new ServerSocket(7777);
			Socket s = ss.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			String fname = in.readLine();
			FileReader fr = null;
			BufferedReader file = null;
			boolean flag;
			File f = new File(fname);
			if(f.exists())
				flag=true;
			else
				flag=false;
			if(flag==true)
				dout.writeBytes("Yes"+"\n");
			else
				dout.writeBytes("No"+"\n");
			if(flag==true)
			{
				fr = new FileReader(fname);
				file = new BufferedReader(fr);
				String str;
				while((str = file.readLine())!=null)
				{
					dout.writeBytes(str+"\n");
				}
				file.close();
				dout.close();
				fr.close();
				s.close();
				ss.close();
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
