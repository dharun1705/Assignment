package week3.day1;
import java.util.Arrays;

public class FindSecondLargest {

		public static void main(String[] args) 
		{
			int num[]= {69,79,23,22,10};
			
			Arrays.sort(num);
			
			for(int i=0;i<num.length;i++)
			{
				System.out.println(num[i]);
			}
	System.out.println("second Largest number is : "+ num[num.length-2]);

	}

}
