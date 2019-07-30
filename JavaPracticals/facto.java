import java.util.Scanner;
class fecto
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,fact=1;
		System.out.println("Enter Factorial Nos.");
		int n = sc.nextInt();
		if(n==0)
		{
				System.out.println("1");
		}
		else
		{
			for(i=1;i<=n;i++)
			{
				fact = fact * i; 
			}
		}
		System.out.println(+fact);
	}
}