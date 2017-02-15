/* Reverse a given input string  */
public class ReverseString
{
	public static void main (String a[])
	{
		String str = "abcdef";
		String rev = new StringBuffer(str).reverse().toString();
		System.out.println("Before Reverse:" +str);
		System.out.println("After Reverse:"+rev);
	}
}