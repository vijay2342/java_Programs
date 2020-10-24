class RowBig 
{
	static int[] rowBig(int t[][])
	{
		int big[]=new int[t.length];

		for(int i=0;i<t.length;i++)
		{
			 big[i]=t[i][0];
			for(int j=1;j<t[0].length;j++)
			{
				if(big[i]<t[i][j])
                 big[i]=t[i][j];
			}
		}
		return big;
	}
	public static void main(String[] args) 
	{
		MatrixReading mr=new MatrixReading();
		int arr[][]=mr.readMatrix();
		int ar[]=rowBig(arr);

		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
