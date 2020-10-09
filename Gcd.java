import java.util.*;
class Gcd 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int a=scan.nextInt();
		System.out.println("enter second number");
		int b=scan.nextInt();
		while(b!=0)
		{
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		System.out.println("gcd of two number is"+a);
	}
}
