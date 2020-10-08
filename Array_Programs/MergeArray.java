import java.util.*;
class MergeArray 
{
	static int[] merge(int a1[],int a2[])
	{
		int a3[]=new int[a1.length+a2.length];
		for(int i=0;i<a1.length;i++)
		{
			a3[i]=a1[i];
		}
		for(int j=0;j<a2.length;j++)
		{
			a3[a1.length+j]=a2[j];
		}
		return a3;
	}
	public static void main(String[] args) 
	{
		Test t=new Test( );
		int arr1[]=Test.readArray( );
		int arr2[]=Test.readArray( );
		int res[]=merge(arr1,arr2);
		System.out.println("the resultant array is:");
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}

	}
}
