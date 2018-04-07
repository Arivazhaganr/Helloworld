package myfiles;
public class Factrec {

	public static int factorial (int n)
	{
	if (n==0)
		return 1;
	else
			return (n*factorial(n-1));
			
			
	}
	public static void main (String[] argss)
	{
		int fact,number=5;
		fact=factorial(number);
		System.out.println("print number "+number+ "is"+fact );
	}
}
