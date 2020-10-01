import java.util.*;
class SpecialDigit 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int rem=num%10;
		int quo=num/10;
		int sum=(rem+quo)+(rem*quo);
		if(sum==num)
		System.out.println("special digit number"+num);
		else
		System.out.println("not special digit number"+num);

	}
}
