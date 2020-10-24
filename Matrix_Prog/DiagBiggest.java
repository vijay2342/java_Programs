class DiagBiggest 
{
	static int[] diagBiggest(int arr[][])
	{
		int primdiagonal=arr[0][0];
        int secdiagonal=arr[0][arr.length-1];

		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j)
				{
					if(primdiagonal<arr[i][j])
					{
						primdiagonal=arr[i][j];
					}
				}
				else if(i+j==arr.length-1)
				{
                  secdiagonal=arr[i][j];
				}
			}
		}
		int ar[]={primdiagonal,secdiagonal};
		return ar;
	}
	public static void main(String[] args) 
	{
		MatrixReading mr=new MatrixReading();
		int arr[][]=mr.readMatrix();
		int ar[]=diagBiggest(arr);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
