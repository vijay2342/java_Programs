import java.util.*;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter year");
		int year=scan.nextInt();
		if(year%400==0 || year%4==0 && year%100!=0)
			System.out.println("leap year"+year);
		else
			System.out.println("not leap year"+year);
	}
}
