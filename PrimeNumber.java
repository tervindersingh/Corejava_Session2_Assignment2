class PrimeNumber
{
	public static void main (String args[])
	{
		int a,b,f,r;
		for (a=2;a<=100;a++)
		{	f=0;
			for(b=2;b<=a-1;b++)
			{
				r=a%b;
				if (r==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.print(" "+a);
			}
		}
				
	}	
}
	