import java.util.*;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to find sum");
		int num=scan.nextInt();
		int sum=1;
		int i=1;
		while(i<=num)
		{
			sum=sum*i;
			i++;
		}
		System.out.println("the sum is"+sum);
	}
}
