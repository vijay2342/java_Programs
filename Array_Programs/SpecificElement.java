import java.util.*;
class SpecificElement 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=scan.nextInt( );
		int num[]=new int[n];
		System.out.println("enter"+n+"elements");
		for(int i=0;i<num.length;i++)
		{
			num[i]=scan.nextInt( );
		}
		System.out.println("enter element to search");
		int key=scan.nextInt();
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==key)
			{
				System.out.println("element found");
				return;
			}
			else
				System.out.println("element not found");
		}
	}
}
