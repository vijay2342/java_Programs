class ColBig 
{
	static int[] colBig(int t[][])
	{
		int big[]=new int[t[0].length];

		for(int i=0;i<t[0].length;i++)
		{
			 big[i]=t[0][i];
			for(int j=1;j<t.length;j++)
			{
				if(big[i]<t[j][i])
                 big[i]=t[j][i];
			}
		}
		return big;
	}
	public static void main(String[] args) 
	{
		MatrixReading mr=new MatrixReading();
		int arr[][]=mr.readMatrix();
		int ar[]=diagBig(arr);

		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
