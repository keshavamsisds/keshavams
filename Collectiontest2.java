/* Listing array elements via for loop */
import java.util.*;  
class CollectionTest2
	{  
		public static void main(String args[])
			{  
				ArrayList<String> al=new ArrayList<String>();  
				  al.add("Ravi");  
				  al.add("Vijay");  
				  al.add("Ramu");  
				  al.add("Lakshmi");  
                  for(String obj:al)  
				  System.out.println(obj);  
            }  
}