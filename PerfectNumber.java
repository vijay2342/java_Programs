import java.util.*;
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int sum=1;
		int i=2;
		while(i<=num/2)
		{
			if(num%i==0)
				sum=sum+i;
			i++;
		}
		if(sum==num)
			System.out.println("perfect number"+num);
		else
			System.out.println("not perfect number"+num);
	}
}
