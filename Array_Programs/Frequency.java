class Frequency 
{
	static void frequency(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int ct=1;
			if(arr[i]>=0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						ct++;
						arr[j]=-1;
					}
				}
				System.out.println(arr[i]+" "+ct);
			}
		}
	}
	public static void main(String[] args) 
	{
		int arr1[]=Test.readArray();
		frequency(arr1);
	}
}
