import java.util.*;
class Test 
{
	public static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter"+n+"elements");
		for(int i=0;i<n;i++)
		{
		  a[i]=sc.nextInt();
		}
		return a;
	}
	public static void main(String[] args) 
	{
		int arr[]=readArray();
	}
}
