import java.util.*;
class Happy 
{
	static boolean happyNumber(int n)
	{
		while(n>9)
		{
			int sum=0;
			do
			{
			 int rem=n%10;
			 sum=sum+(rem*rem);
			 n=n/10;
			}while(n!=0);
			n=sum;
		}
		return n==1||n==7;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		boolean res=happyNumber(n);
		if(res)
		System.out.println(res);
		else
		System.out.println(res);
	}
}
