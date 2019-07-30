import java.io.*;
import java.net.*;
public class SortingServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(5555);
		Socket s = ss.accept();
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		int n = din.readInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++)
			array[i] = din.readInt();
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
			dout.writeInt(array[i]);
	ss.close();
	s.close();
	din.close();
	dout.close();
	
	}
}
