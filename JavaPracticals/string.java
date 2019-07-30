import java.util.*;
class string
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter String:");
		s = sc.nextLine();
		int c = s.length();
		System.out.println("Length of string is :"+c);
		int d = s.indexOf(' ');
		for(int i=d+1;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
		
	}
}