import java.io.*;
import java.net.*;
public class FileTransferSocket {
	public static void main(String[] args) {
		try {
		Socket s = new Socket("LocalHost",7777);
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter File Name:");
		String fname = kb.readLine();
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		out.writeBytes(fname+"\n");
		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = "";
		str = in.readLine();
		if(str.equals("Yes"))
		{
			while((str = in.readLine())!=null)
			{
				System.out.println(str);
				kb.close();
				out.close();
				in.close();
				s.close();
			}
		}
		else
			System.out.println("File not found");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
