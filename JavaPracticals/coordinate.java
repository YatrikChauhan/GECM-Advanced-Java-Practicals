import java.util.*;
class coordinate
{
	int x,y,z;
	coordinate(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
	}
	void display()
	{
		System.out.println("("+x+","+y+","+z+")");
	}
	coordinate add(coordinate V)
	{
		V.x = x + V.x;
		V.y = y + V.y;
		V.z = z + V.z;
		return V;
	}
}
class coordinate_add
{
	public static void main(String args[])
	{
		coordinate A = new coordinate(10,20,30);
		coordinate B = new coordinate(20,30,40);
		System.out.println("First coordinate is:");
		A.display();
		System.out.println("Second coordinate is:");
		B.display();
		System.out.println("Addition of both coordinate is:");
		coordinate C = A.add(B);
		C.display();
	}
}