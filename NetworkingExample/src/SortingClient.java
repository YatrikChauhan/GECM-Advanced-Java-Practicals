import java.net.*;
import java.util.Scanner;
import java.io.*;
public class SortingClient {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("LocalHost",5555);
		Scanner sc = new Scanner(System.in);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		System.out.println("Enter N:");
		int n = sc.nextInt();
		System.out.println("Enter Unsorted Elements:");
		dout.writeInt(n);
		for(int i=0;i<n;i++) {
			int r = sc.nextInt();
			dout.writeInt(r);
		}
		System.out.println("Sorted Elements:");
		for(int i=0;i<n;i++)
		{
			int r = din.readInt();
			System.out.println(r+"  ");
		}
		s.close();
		sc.close();
		din.close();
		dout.close();
	}

}
