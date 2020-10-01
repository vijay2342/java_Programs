import java.util.*;
class Strong 
{
	static boolean isStrong(int n)
	{
		int t=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+fact(rem);
			n=n/10;
		}
		if(t==sum)
			return true;
		else
			return false;
	}
	static int fact(int temp)
	{
		int sum=1;
		while(temp>1)
		{
			sum=sum*temp;
			temp--;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		boolean b=isStrong(num);
		if(b)
			System.out.println("strong number"+num);
		else
			System.out.println("not strong number"+num);
	}
}
