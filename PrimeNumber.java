import java.util.*;
class PrimeNumber 
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
			if(count>2)
				break;
			i++;
		}
		if(count==2)
			System.out.println("prime number"+num);
		else
			System.out.println("not prime number"+num);
	}
}
