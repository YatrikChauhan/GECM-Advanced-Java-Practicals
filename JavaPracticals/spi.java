import java.util.*;
class student
{
	Scanner sc = new Scanner(System.in);
	int id_no,no_of_subject_registered;
	double subject_code[] = new double[10];
	int subject_credit[] = new int[10];
	float spi;
	int grade_point[] = new int[10];
	String grade_obtained[] = new String[10];
	student()
	{
			System.out.println("Enter details for student:");
			System.out.println("Enter id_no of student:");
			id_no = sc.nextInt();
			System.out.println("Enter no of subject registered:");
			no_of_subject_registered = sc.nextInt();
			System.out.println("Enter Subject code for all subject & its creadits & Grade Obtained by Student:");
			for(int j=1;j<=no_of_subject_registered;j++)
			{
				System.out.println("--------------------------------------");
				System.out.println("Enter Details of subject:"+j);
				System.out.println("subject_code:");
				subject_code[j] = sc.nextDouble();
				System.out.println("subject_credit:");
				subject_credit[j] = sc.nextInt();
				System.out.println("grade_obtained:");
				grade_obtained[j] = sc.next();
			}
			
	}
	void calculate_spi()
	{
		int cr=0,acr=0;
		for(int k=1;k<=no_of_subject_registered;k++)
		{
				if(grade_obtained[k].equals("AA"))
					grade_point[k]=10;
				else if(grade_obtained[k].equals("AB"))
					grade_point[k]=9;
				else if(grade_obtained[k].equals("BB"))
					grade_point[k]=8;
				else if(grade_obtained[k].equals("BC"))
					grade_point[k]=7;
				else if(grade_obtained[k].equals("CC"))
					grade_point[k]=6;
				else if(grade_obtained[k].equals("CD"))
					grade_point[k]=5;
				else if(grade_obtained[k].equals("DD"))
					grade_point[k]=4;
				else if(grade_obtained[k].equals("EE"))
					grade_point[k]=3;
				else if(grade_obtained[k].equals("FF"))
					grade_point[k]=2;
			cr = (subject_credit[k] * grade_point[k]) + cr;
			acr = (subject_credit[k] + acr);
		}
		spi = (float)cr /(float)acr;
	}
	void display()
	{
		System.out.println("Spi of student "+spi);
	}
}
class spi_calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Total students:");
		Integer n = sc.nextInt();
		student[] a;
		a = new student[n];
		for(int i=0;i<n;i++)
		{
			a[i] = new student();
			a[i].calculate_spi();
			a[i].display();
		}
	}
}