import java.util.Scanner;
public class EvenOdd
{	
	public static void main (String[] Args)
	{
		Scanner user_input = new Scanner(System.in);
		int a;
		System.out.println("Enter a number to verify :");
		a = user_input.nextInt();
		if (a%2==0)
		{
			System.out.println("The inputed number is Even");
		}
		else
		{
			System.out.println("The inputed number is Odd");
		}
	}
}
	