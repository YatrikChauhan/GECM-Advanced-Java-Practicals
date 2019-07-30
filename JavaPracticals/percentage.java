import java.util.Scanner;
class percentage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float per,total=0;
		int a[] = new int[6];
		System.out.println("Enter Marks of 6 subjects");
		for(int i=0;i<6;i++)
		{
			a[i] = sc.nextInt();
			total = total + a[i];
		}
		System.out.println("Total marks of 6 Subject is:"+total);
		per = (total * 100)/600;
		System.out.println("Percentage of 6 marks is:"+per);
	}
}