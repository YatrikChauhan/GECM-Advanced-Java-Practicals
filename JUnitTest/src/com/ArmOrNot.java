package com;
import java.util.*;
public class ArmOrNot {
	public int armstrong(int n)
	{
		int c=0,a,temp;
		temp = n;
		while(n>0)
		{
			a = n%10;
			n = n/10;
			c = c+(a*a*a);
		}
		if(temp == c)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
