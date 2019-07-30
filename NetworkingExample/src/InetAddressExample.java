import java.io.*;
import java.net.*;
public class InetAddressExample {
	public static void main(String[] args) throws IOException {
		String str;
		InputStreamReader ir = new InputStreamReader(System.in);
		System.out.println("Enetr Site:");
		BufferedReader r1 = new BufferedReader(ir);
		try {
			str = r1.readLine();
			InetAddress i1 = InetAddress.getByName(str);
			System.out.println(i1);
			System.out.println("Local Host Name:"+i1.getHostName());
			System.out.println("Ip address of LocalHost:"+i1.getLocalHost());
			System.out.println("GetAllByName:");
			InetAddress[] i2 = i1.getAllByName(str);
			for(int i=0;i<i2.length;i++)
			{
				System.out.println(i2[i]);
			}
		} catch (UnknownHostException e)
		{
			e.printStackTrace();
		}
	}
}
