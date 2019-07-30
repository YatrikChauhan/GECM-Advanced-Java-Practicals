import java.io.*;
class checkedExceptionDemo
{
	public static void main(String args[]) throws IOException
	{
		FileReader file = new FileReader("C:\\Yatrik.txt");
		BufferedReader fileinput = new BufferedReader(file);
		for(int c=0;c<3;c++)
		{
		System.out.println(fileinput.readLine());
		}
		fileinput.close();
	}
}