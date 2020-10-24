class RowReverse 
{
	static int[][] rowReverse(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
          for(int j=0;j<arr[i].length/2;j++)
		  {
			  int temp=arr[i][j];
			  arr[i][j]=arr[i][arr.length-1];
			  arr[i][arr.length-1]=temp;
          }
		}
		return arr;
	}
	public static void main(String[] args) 
	{
		MatrixReading mr=new MatrixReading();
		int arr[][]=mr.readMatrix();
		int ar[][]=rowReverse(arr);
		for(int i=0;i<ar.length;i++)
		{
          for(int j=0;j<ar[i].length;j++)
		  {
		     System.out.print(ar[i][j]);		
          }
			System.out.println();
		}
	}
}
