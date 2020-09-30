import java.util.*;
class Biggest 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=scan.nextInt();
		System.out.println("enter second number");
		int num2=scan.nextInt();
		if(num1>num2)
		    System.out.println("biggest is "+num1);
		else
			System.out.println("biggest is "+num2);
	}
}
