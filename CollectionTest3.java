import java.util.*; 

class Student{  
  int rollno;  
  String name;  
  int age;  
  Student(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }  
  
}  

/* Creating user defined class in ArrayList */

public class CollectionTest3
{
	public static void main(String[] Args)
	{
		/* Creating user defined class called Student */
		Student s1 = new Student(10, "Keshava", 32);
		Student s2 = new Student(20, "Sahana", 27);
		Student s3 = new Student(30, "Lakshmi", 29);
		
		/* crreate an array list for used defined class */
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		/*Traverse through iterator*/
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Student st = (Student)itr.next();
			System.out.println(st.rollno+"  "+st.name+"  "+st.age);
		}
	}	
}
		