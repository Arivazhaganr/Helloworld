package myfiles;
import java.util.Arrays;
import java.util.Scanner;

public class Twodimension {
	public static void main (String [] args)
	{
		int s;int row=0,col=0;String temp;
		System.out.println("enter number of names and location you want to enter");
		Scanner n=new Scanner(System.in);
		s=n.nextInt();
	row=s;
	col=s;
	Scanner scanner = new Scanner (System.in); 

	String [][]data=new String [row][col];
	for (int i = 0; i < row; i++) {

		for (int j = 0; j < col; j++) {

		System.out.println("Enter the number for row " + i + " and column " + j + " : ");

		data [i][j] = scanner.nextLine();
		
	}

}
	for (int a=0;a<row;a++)
	{
		for (int b=0;b<col;b++)
		{
			
		System.out.println(data[a][b]);
		}
		
	}
	
	}
}