import java.util.*;
class WithOutLoop 
{
	public static void main(String[] args) 
	{
		Scanner key=new Scanner(System.in);
		System.out.println("Enter the integer:"); 
		int no=key.nextInt();
		String str[]={"Even","Odd"};
		System.out.println(no+" is "+str[no%2]+" Number ");

	}
}
