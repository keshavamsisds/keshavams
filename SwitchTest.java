import java.util.Scanner;
public class SwitchTest
{
	public static void main (String[] Args)
		{
			Scanner user_input = new Scanner(System.in);
			int a;
			System.out.println("Enter the number:");
			a = user_input.nextInt();
			
			switch(a)
			{
				case 10:System.out.println("10"); break;
				case 20:System.out.println("20"); break;
				default:System.out.println("not in 10 or 20");break;
			}
		}
}
		