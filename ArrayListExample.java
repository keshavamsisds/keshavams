import java.util.*;
class Book
{
	int id, quantity;
	String name,author, publisher;
	Book(int id, String name, String author, String publisher, int quantity)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class ArrayListExample
{
		public static void main(String[] Args)
		{
			ArrayList<Book> list = new ArrayList<Book>();
			
			Book b1 = new Book(100, "Oracle Shell Scripting", "Jon Emmons" , "Oracle in-focus seris", 10);
			Book b2 = new Book(200, "OraclePL/SQL Tips & Techniques", "Paul Dorsey", "McGrawHill", 15);
			Book b3 = new Book(300, "The Happy Employee", "Julia Mc.Govern", "Vivo Books", 20);
			
			list.add(b1); list.add(b2); list.add(b3);
			
			for(Book b:list)
			{
				System.out.println(b.id+"  "+b.name+"  "+b.author+"   "+b.publisher+"   "+b.quantity);
			}
		}
}
		