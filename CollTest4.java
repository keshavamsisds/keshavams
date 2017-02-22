/* Creating user defined class in ArrayList */
import java.util.*;

class Student
{
	int rollno;
	String name;
	int age;
	
	Student(int rollno, String name, int age)
	{
		this.rollno = rollno;
		this.name   = name;
		this.age    = age;
	}
}

public class CollTest4
{
		public static void main(String[] Args)
		{
			Student s1 = new Student(100, "Keshava", 35);
			Student s2 = new Student(200, "Sahana", 27);
			Student s3 = new Student(300, "Lakshmi", 30);
			/* Create Arraylist for User defined class STUDENT*/
			ArrayList<Student> al = new ArrayList<Student>();
			/* Add elements  of student */
			al.add(s1);
			al.add(s2);
			al.add(s3);
			
			/* Traverse  through Iterator */
			Iterator itr = al.iterator();
			while(itr.hasNext())
			{
				Student st = (Student)itr.next();
				System.out.println(st.rollno+"   "+st.name+"    "+st.age);
			}
		}
}
		
			