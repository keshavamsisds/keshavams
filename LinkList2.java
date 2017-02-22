/* Linked List Arry implementation wth user defined class called Book */
import java.util.*;
class Book
{
	int id, quantity;
	String name, author, publisher;
	Book(int id, String name, String author, String publisher, int quantity)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class LinkList2
{
		public static void main(String[] args)
		{
			LinkedList<Book> al = new LinkedList<Book>();
			
			Book b1 = new Book(100, "Oracle 1", "Author 1", "Publisher 1", 10); 
			Book b2 = new Book(200, "Oracle 2", "Author 2", "Publisher 2", 20);
			Book b3 = new Book(300, "Oracle 3", "Author 3", "Publisher 3", 30);
			
			al.add(b1); al.add(b2); al.add(b3);
			
			for(Book b:al)
			{
				System.out.println(b.id+"  "+b.name+"  "+b.author+"  "+b.publisher+"  "+b.quantity);
			}
		}
}		