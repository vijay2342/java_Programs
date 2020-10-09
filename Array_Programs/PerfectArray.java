class PerfectArray 
{
	static boolean isPerfect(int num)
	{
		int sum=1;
		int i=2;
		while(i<=num/2)
		{
			if(num%i==0)
			  sum=sum+i;
			  i++;
		}
		if(num==sum)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		int arr1[]=Test.readArray();
		int percount=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(isPerfect(arr1[i]))
			{
				percount++;
			}
		}
		System.out.println("No of perfect numbers"+percount);
	}
}
