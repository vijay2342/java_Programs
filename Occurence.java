import java.util.*;
class Occurence 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		System.out.println("enter digit to find occurence");
		int key=scan.nextInt();
		int ct=0;
		while(num>0)
		{
			if(num%10==key)
			{
				ct=ct+1;
			}
			else
			{
				ct=ct;
			}
			num=num/10;
		}
		System.out.println("occurence is"+ct);
	}
}
