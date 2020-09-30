import java.util.*;
class DigitNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		if(num<=9 && num>=-9)
			System.out.println("Digit"+num);
		else
			System.out.println("Number"+num);
	}
}
