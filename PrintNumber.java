import java.util.*;
class PrintNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter range of number");
		int n=scan.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}
