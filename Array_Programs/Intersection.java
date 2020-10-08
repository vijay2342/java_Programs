class Intersection 
{
	static int[] interArray(int arr1[],int arr2[])
	{
		int res[]=new int[arr1.length];
		int k=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;i<arr2.length;j++)
			{
				res[k]=arr1[i];
				k++;
				break;
			}
		}
		int com[]=new int[k];
		for(int j=0;j<k;j++)
			{
				com[j]=res[j];
			}
			return com;
	}
	public static void main(String[] args) 
	{
		int arr1[]=Test.readArray( );
		int arr2[]=Test.readArray( );
		int res[]=interArray(arr1,arr2);
		System.out.println("the common element in array is:");
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
}
