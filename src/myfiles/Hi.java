package myfiles;
import java.util.Scanner;
public class Hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter a string to reverse");
		Scanner read=new Scanner(System.in);
		String s=read.nextLine();
		
		
				
String a;
//System.out.println(s.charAt(3));

//System.out.println(s.indexOf("i"));
//System.out.println(s.substring(1, 9));
a=palindrome(s);
if (s.equals(a))
System.out.println("given is a palindrome");
else 
	System.out.println("given name is not palindrome");
//System.out.println(s);
//System.out.println(a);
	}
	
 static String palindrome(String s)
{String reverse="";	

for (int i=s.length()-1;i>=0;i--)
{
reverse=reverse+s.charAt(i);
}return reverse;
}
}