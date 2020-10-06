import java.util.*;	
class BinDec 
{
	static int binToDec(int n)
	{
		int dec=0,p=1;
		while(n!=0)
		{
			int rem=n%10;
			dec=dec+(rem*p);
			p=p*2;
			n=n/10;
		}
		return dec;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		int Dec=binToDec(num);
		System.out.println("the converted decimal is"+Dec);
	}
}
