import java.util.*;
class P3 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter how many lines");
		int n=scan.nextInt();
		//To Print Line
		for(int i=1;i<=n;i++)
		{
			//To Print Star
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
		    }
			System.out.println("");
		}
	}
}
