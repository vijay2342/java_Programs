class CheckFibonacci 
{
   static boolean perfect_square_check(int val)
   {
      int s = (int) Math.sqrt(val);
      return (s*s == val);
   }
   static boolean fibonacci_num_check(int n)
   {
      return perfect_square_check(5*n*n + 4) || perfect_square_check(5*n*n - 4);
   }
	public static void main(String[] args) 
	{
      int n=5;
      System.out.println(fibonacci_num_check(n) ?"yes" : " no");
    }
}
