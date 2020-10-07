import java.util.*;
class AvgNumber 
{
	public static void main(String[ ] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=scan.nextInt( );
		int num[]=new int[n];
		System.out.println("enter"+n+"elements");
		for(int i=0;i<num.length;i++)
		{
			num[i]=scan.nextInt( );
		}
		int sum=0;
		float avg=0.0f;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		avg=sum/n;
		System.out.println("the avg of"+n+"numbers is"+avg);
	}
}
