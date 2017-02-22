/* using retainAll method to add elements of two arraylist */
import java.util.*;
public class CollTest6
{
	public static void main(String[] Args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("four");
		al2.add("five");
		al2.add("three");
		
		al.retainAll(al2);
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}		
		