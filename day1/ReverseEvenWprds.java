package week3.day1;

public class ReverseEvenWprds
{

	public static void main(String[] args) 
	{
		String text="I am a Software Tester";
		String[] text1 = text.split(" ");
	    for(int i=0;i<=text1.length-1;i++)
	{
	    	
		    if(i%2!=0) 
		{
			char [] c=text1[i].toCharArray();
			for (int j=c.length-1;j>=0;j--) 
			{
				System.out.print(c[j]);
			}
			
			
		}
		else 
		{
			System.out.println(text1[i]);
		}
		   
	
}

	}

}
