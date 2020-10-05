import java.util.*;
class Power
{
	static int powerNumber(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		System.out.println("enter the power");
		int p=scan.nextInt();
		int res=powerNumber(n,p);
		System.out.println("result is"+res);
	}
}
