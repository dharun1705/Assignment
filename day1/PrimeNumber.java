package week3.day1;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
	int i,m=0,c=0;
	int n=121;
	m=n/2;
	if(n==0||n==1)
	{
		System.out.println(n);
	}
	else
	{
		for(i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println("not prime");
				c=1;
				break;
			}
		}
		if(c==0)
		{
			System.out.println("prime number");
		}
	
	}

}
}