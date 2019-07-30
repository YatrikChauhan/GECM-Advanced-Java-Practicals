import java.util.*;
class rectangle
{
	double xc,yc;
	int width,height;
	rectangle()
	{
		xc=0;
		yc=0;
		width=height=1;
	}
	rectangle(int x,int y,int wi,int hi)
	{
		xc=x;
		yc=y;
		width=wi;
		height=hi;
	}
	int getarea()
	{
		return width * height;
	}
	int getperimeter()
	{
		return 2*(width + height);
	}
	void check(int xs,int ys)
	{
		boolean search = false;
		if((xc - (width/2)) <= xs && (xc + (width/2)) >= xs)
		{
			if((yc - (height/2)) <= ys && (yc + (height/2)) >= ys)
			{
				search = true;
			}
		}
		if(search == true)
		{
			System.out.println("Given point is into the rectangle");
		}
		else
		{
			System.out.println("Given point is outside the rectangle");
		}
	}
}
class rectangle_methods
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int c,d,e,f;
	rectangle r2 = new rectangle(3,3,2,1);
	e = r2.getarea();
	System.out.println("Area of rectangle 1 is:"+e);
	f = r2.getperimeter();
	System.out.println("Perimeter of rectangle 1 is:"+f);
	
	System.out.println("Enter Center points for rectangle:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Enter higths and width for rectangle:");
	int w = sc.nextInt();
	int h = sc.nextInt();
	
	rectangle r1 = new rectangle(a,b,w,h);
	c = r1.getarea();
	System.out.println("Area of rectangle 1 is:"+c);
	d = r1.getperimeter();
	System.out.println("Perimeter of rectangle 1 is:"+d);
	System.out.println("Enter points to check whether given point in into the rectengle or outside the rectangle:");
	int xs = sc.nextInt();
	int ys = sc.nextInt();
	r1.check(xs,ys);
	}
}

