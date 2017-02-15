/* Compare two input strings to identify equalor not */

public class MyStringEquals
{
  public static void main(String a[])
   {
      String x = "JUNK";
      String y = "junk";
      
      if (x.equals(y)) 
		{
		System.out.println("Both are equal");
		}
     else
		{
		System.out.println("Both are not equal");
		}
	if (x.equalsIgnoreCase(y)) 
		{
		System.out.println("Both are equal");
		}
	 else
		{
		System.out.println("Both are not equal");
		}
   }
}
