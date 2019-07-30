import java.io.*;
import java.net.*;
import java.util.Scanner;
public class client1 {
	public static void main(String[] args) throws Exception {
		Socket s = new Socket("LocalHost",4444);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		dout.writeUTF(str);
		System.out.println("Reverse String is:"+din.readUTF());
		s.close();
	}
}
