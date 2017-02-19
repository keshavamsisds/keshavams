/* Java Arry list class example 1 */
import java.util.*;
public class CollectionTest1
{
	public static void main(String args[])
		{
		    ArrayList<String> list=new ArrayList<String>();
			list.add("Ravi");
			list.add("Ramu");
			list.add("Lakshmi");
			Iterator itr = list.iterator();
			while(itr.hasNext())
			{	
				System.out.println(itr.next());
			}
		}
}
		
	