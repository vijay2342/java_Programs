import java.util.*;
class Index 
{
	static int findIndex(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		    else
				{
			   return -1;
				}
		}
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
		System.out.println("enter the element to find index");
		int key=scan.nextInt();
		int index=findIndex(num,key);
		System.out.println("the index is"+index);
	}
}
