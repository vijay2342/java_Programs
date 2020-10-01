import java.util.*;
class CountDigit 
{
	static int countDigit(int n)
	{
		int ct=0;
		do
		{
			ct++;
			n=n/10;
		}while(n!=0);
		return ct;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int dig=countDigit(num);
		System.out.println("number of digits is"+dig);
	}
}
