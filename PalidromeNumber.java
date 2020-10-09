import java.util.*;
class PalidromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int sum=0;
		int temp=num;
		while(num!=0)
		{
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(sum==temp)
			System.out.println("palidrome"+temp);
		else
			System.out.println("not palidrome"+temp);
	}
}
