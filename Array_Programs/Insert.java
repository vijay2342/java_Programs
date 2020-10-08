import java.util.*;
class Insert 
{
	static int[] insertPos(int arr1[],int pos,int ele)
	{
		int res[]=new int[arr1.length+1];
		res[pos]=ele;
		for(int i=0;i<arr1.length;i++)
		{
			if(i<pos)
			{
				res[i]=arr1[i];
			}
			else
			{
				res[i+1]=arr1[i];
			}
		}
		return res;
	}
	public static void main(String[] args) 
	{
		int arr1[]=Test.readArray( );
		Scanner sc=new Scanner(System.in);
		System.out.println("enter position to be inserted");
		int pos=sc.nextInt();
		System.out.println("enter element to be inserted");
		int ele=sc.nextInt();
		int res[]=insertPos(arr1,pos,ele);
		System.out.println("the resultant array is:");
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
}
