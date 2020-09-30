import java.util.*;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		if((num/2)*2==num)
		{
			System.out.println("even number"+num);
		}
		else
			System.out.println("odd number"+num);
	}
}
