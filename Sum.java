import java.util.*;
class Sum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to find sum");
		int num=scan.nextInt();
		int sum=0;
		int i=0;
		while(i<=num)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("the sum is"+sum);
	}
}
