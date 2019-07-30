import java.util.Scanner;
class maximum
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A:");
		int a = sc.nextInt();
		System.out.println("Enter B:");
		int b = sc.nextInt();
		System.out.println("Enter C:");
		int c = sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Maximum");
			}
		}
		else if(b>c)
			{
				System.out.println("B is Maximum");
			}
		else
		{
				System.out.println("C is Maximum");
		}
	}
	
}