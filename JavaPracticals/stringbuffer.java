import java.util.*;
class stringbuffer
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		StringBuffer s1 = new StringBuffer();
		System.out.println("Enter string 1 and string 2:");
		s1.append(sc.nextLine());
		LOOP:
		while(true)
		{
			System.out.println("1:Appends the string");
			System.out.println("2:Calculate capacity of stringbuffer");
			System.out.println("3:Check the character at any index of stringbuffer in sequence");
			System.out.println("4:Delete the character from starting and ending index of stringbuffer");
			System.out.println("5:Insert the character at position given by user");
			System.out.println("6:Check the length of stringbuffer");
			System.out.println("7:Reverse the stringbuffer");
			System.out.println("8:Create substring formed by last six charcter of stringbuffer");
			System.out.println("9:Exit");
			System.out.println("Enter Your choice:");
			int n = sc.nextInt();
		
			switch(n)
			{
				case 1: System.out.println("Enter string which you want to append:");
						String s2 = new String();
						s2 = sc.next();
						s1.append(s2);
						System.out.println("After append stringbuffer is :"+s1);
						break;
				case 2: int c = s1.capacity();
						System.out.println("Capacity of stringbuffer is :"+c);
						break;
				case 3: int index;
						System.out.println("Enter index:");
						index = sc.nextInt();
						char d = s1.charAt(index);
						System.out.println("character at given index is :"+d);
						break;
				case 4: int stindex,enindex;
						System.out.println("Enter starting index and ending index:");
						stindex = sc.nextInt();
						enindex = sc.nextInt();
						s1.delete(stindex,enindex);
						System.out.println("After deleting char stringbuffer is:"+s1);
						break;
				case 5: int sindex;
						char ch;
						System.out.println("Enter index:");
						sindex = sc.nextInt();
						System.out.println("Enter character:");
						ch = sc.next().charAt(0);
						s1.insert(sindex,ch);
						System.out.println("After insert at char at index new stringbuffer is :"+s1);
						break;
				case 6: int f = s1.length();
						System.out.println("length is :"+f);
						break;
				case 7: 
						s1.reverse();
						System.out.println("Reverse stringbuffer is :"+s1);
						System.out.println("After reversing the stringbuffer is:"+s1);
						break;
				case 8: StringBuffer substring = new StringBuffer();
						substring = s1.delete(0,(s1.length())-6);
						System.out.println("Formed substring is:"+substring);
						break;
				case 9: 	
						break LOOP;
			}
		}
	}
}