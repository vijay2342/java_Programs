import java.util.*;
class CountEO 
{
	static int[] evenOdd(int arr[])
	{
		int ecount=0,ocount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
		}
		int total[]={ecount,ocount};
		return total;
	}
	public static void main(String[] args) 
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
		int std[]=evenOdd(num);
		for(int i=0;i<std.length;i++)
		{
			System.out.println(std[i]);
		}
	}
}
