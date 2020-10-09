class ZigZag 
{
	static int[] zigZag(int arr1[],int arr2[])
	{
		int res[]=new int[arr1.length+arr2.length];
		int j=0;
		for(int i=0;i<res.length;)
		{
			if(j<arr1.length)
			{
				res[i]=arr1[j];
				i++;
			}
			if(j<arr2.length)
			{
				res[i]=arr2[j];
				i++;
			}
			j++;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		int arr1[]=Test.readArray();
		int arr2[]=Test.readArray();
		int res[]=zigZag(arr1,arr2);
		System.out.println("the zigzag array elements are: ");
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
}
