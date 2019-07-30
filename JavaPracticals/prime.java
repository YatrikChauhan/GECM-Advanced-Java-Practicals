class prime
{
	public static void main(String args[])
	{
		int i,j,c,n=100;
		for(i=2;i<=n;i++)
		{ 	
			c=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(+i);
			}
		}
	}
}