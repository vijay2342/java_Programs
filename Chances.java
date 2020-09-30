import java.util.*;
class Chances 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		Random rn=new Random();
		int count=0;
		while(true)
		{
			System.out.println("guess the number from 0 to 9");
		    int num=scan.nextInt();
		    int ran=rn.nextInt(10);
			count++;
			if(num==ran)
				break;
			else
				System.out.println("number is "+ran);
		}
			System.out.println("chances taken"+count);
	}
}
