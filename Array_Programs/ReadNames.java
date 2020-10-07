import java.util.*;
class ReadNames 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=scan.nextInt();
		String names[]=new String[n];
		System.out.println("enter"+n+"elements");
		for(int i=0;i<names.length;i++)
		{
			names[i]=scan.next();
		}
		System.out.println("The elements are:");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	}
}
