import java.util.*;
class DecHex 
{
	static String decToHex(int n)
	{
		String hex="";
		do
		{
			int rem=n%16;
			if(rem<10)
				hex=rem+hex;
			else
				hex=(char)(rem+55)+hex;
				n=n/16;
		}while (n!=0);
		return hex;
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		String Hex=decToHex(num);
		System.out.println("the converted Hexadecimal is"+Hex);
	}
}
