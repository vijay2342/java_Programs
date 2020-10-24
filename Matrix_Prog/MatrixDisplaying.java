class MatrixDisplaying
{
	public static void main(String[] args) 
	{
		MatrixReading mr=new MatrixReading();
		int arr[][]=mr.readMatrix();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
}
