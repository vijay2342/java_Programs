import java.util.*;
class Divisors 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int count=2;
		int i=2;
		while(i<=num/2)
		{
			if(num%i==0)
				count++;
			i++;
		}
		System.out.println("no of divisors"+count);
	}
}
