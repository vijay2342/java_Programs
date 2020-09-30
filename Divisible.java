import java.util.*;
class Divisible 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		if(num%3==0 & num%5==0)
			System.out.println("sanju weds geetha");
		else if(num%3==0)
			System.out.println("sanju");
		else if(num%5==0)
			System.out.println("geetha");
		else
			System.out.println("break up");
	}
}
