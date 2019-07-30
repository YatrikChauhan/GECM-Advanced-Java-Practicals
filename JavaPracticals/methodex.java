import java.util.*;
class BAD
{
	void Show()
	{
		System.out.println("Display");
	}
}
class tes
{
	public static void main(String args[]) throws NoSuchMethodException
	{
		BAD a = new BAD();
		a.Show();
		
	}
}