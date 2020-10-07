import java.util.*;
class Biggest 
{
	static int findBiggest(int arr[])
	{
		int big=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(big<arr[i])
			{
				big=arr[i];
			}
		}
		return big;
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
		int big=findBiggest(num);
		System.out.println("the biggest elemnt in array is"+big);
	}
}
