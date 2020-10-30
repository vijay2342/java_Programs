class ColReverse 
{
	static int[][] colReverse(int arr[][])
	{
		for(int i=0;i<arr.length/2;i++)
		{
          for(int j=0;j<arr[i].length;j++)
		  {
			  int temp=arr[i][j];
			  arr[i][j]=arr[arr.length-1-i][j];
			  arr[arr.length-1-i][j]=temp;
          }
		}
		return arr;
	}
	public static void main(String[] args) 
	{
		MatrixReading mr=new MatrixReading();
		int arr[][]=mr.readMatrix();
		int ar[][]=colReverse(arr);
		for(int i=0;i<ar.length;i++)
		{
          for(int j=0;j<ar[i].length;j++)
		  {
		     System.out.print(ar[i][j]);		
          }
		}
	  }
}

