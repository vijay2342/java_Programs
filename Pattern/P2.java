import java.util.*;
class P2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter how many star to print");
		int n=scan.nextInt();
		//In Same Line
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		System.out.println("");
		//In Different Line
		for(int j=1;j<=n;j++)
		{
			System.out.println("*");
		}
	}
}
