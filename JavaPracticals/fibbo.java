import java.util.Scanner;
class fibbo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length Of Fibbonaci Series:");
		int n = sc.nextInt();
		int a=0,b=1,c,i;
		System.out.println(+a +b);
		for(i=0;i<n;i++)
		{
				c = a + b;
				a=b;
				b=c;
				System.out.println( +c);
		}
	}
}