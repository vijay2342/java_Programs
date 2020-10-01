import java.util.*;
class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(temp==sum)
			System.out.println("armstrong number"+temp);
		else
			System.out.println("not armstrong number"+temp);

	}
}
