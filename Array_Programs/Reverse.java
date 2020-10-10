class Reverse 
{
	static int[] reverseArray(int arr1[])
	{
		int rev[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			int t=arr1[i];
			rev[i]=arr1[arr1.length-1-i];
			rev[rev.length-1-i]=t;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		int arr1[]=Test.readArray();
		int rev[]=reverseArray(arr1);
		for(int i=0;i<rev.length;i++)
		{
			System.out.print(rev[i]);
		}
	}
}
