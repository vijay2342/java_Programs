class Transpose 
{
	static int[][] transPose(int arr[][])
	{
		int t[][]=new int[arr[0].length][arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
          for(int j=0;j<arr[i].length;j++)
		  {
			  t[j][i]=arr[i][j];
          }
		}
		return t;
	}
	public static void main(String[] args) 
	{
		MatrixReading mr=new MatrixReading();
		int arr[][]=mr.readMatrix();
		int ar[][]=transPose(arr);
		for(int i=0;i<ar.length;i++)
		{
          for(int j=0;j<ar[i].length;j++)
		  {
		     System.out.print(ar[i][j]);		
          }
		}
	}
}
