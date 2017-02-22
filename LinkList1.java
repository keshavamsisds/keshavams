/* Example showing linked list array creation */
import java.util.*;
public class LinkList1
{
	public static void main(String[] Args)
	{
			LinkedList<String> al = new LinkedList<String>();
			
			al.add("Keshava"); 
			al.add("Sahana"); 
			al.add("Lakshmi");
			
			for(String Obj:al)
			{
				System.out.println(Obj);
			}
	}
}