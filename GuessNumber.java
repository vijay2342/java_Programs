import java.util.*;
class GuessNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		Random rn=new Random();
		System.out.println("guess the number from 0 to 9");
		int num=scan.nextInt();
		int ran=rn.nextInt(10);
		if(num==ran)
			System.out.println("you won");
		else
			System.out.println("you lost"+ran);
	}
}
