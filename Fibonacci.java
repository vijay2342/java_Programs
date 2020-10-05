import java.util.*;
class Fibonacci 
{
	static int fibonacci(int n)
	{
		int a=0,b=1;
	    while(n>0)
		 {
		   System.out.println(a);
		   int c=a+b;
		   a=b;
		   b=c;
		   n--;
		 }
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int res=fibonacci(n);
		System.out.println("first"+n+"fibonacci is"+res);
	}
}
