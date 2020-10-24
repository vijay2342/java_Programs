import java.util.Scanner;
class MatrixReading 
{
	public static int[][] readMatrix()
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows and columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		System.out.println("enter"+row*col+"values");
		int arr[][]=new int[row][col];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	  }
	public static void main(String[] args) 
	{
		int arr[][]=readMatrix();
	}
}
