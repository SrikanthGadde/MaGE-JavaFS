package main;

import java.util.ArrayList;
import java.util.Scanner;

import data.BookDAO;
import model.Book;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 Add book");
		System.out.println("2 Get books");
		System.out.println("3 Update price");
		System.out.println("4 Get a book by name");
		BookDAO ob = new BookDAO();
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
		{
			System.out.println("Enter the book id");
			int pid = sc.nextInt();
			System.out.println("Etner the book name");
			String pname = sc.next();
			System.out.println("Enter the book price");
			int pprice = sc.nextInt();
			
			Book b = new Book(pid,pname,pprice);
			
			System.out.println(ob.addBook(b));
		break;
		
		}
		case 2: {
		
		ArrayList<Book> blist = ob.getAllBooks();
		System.out.println("The following are the books in the database");
		for (Book book:blist) {
			System.out.println(book);
		}
		break;
		}
		case 3:{
			System.out.println("Enter the book id");
			int bId = sc.nextInt();
			System.out.println("Enter the updated price");
			int bPrice = sc.nextInt();
			
			System.out.println(ob.updatePrice(bId, bPrice));
			
		}
		case 4: {
			System.out.println("Enter the name of the book");
			String name = sc.next();
			Book b = ob.getDetailsbyName(name);
			if (b == null) {
				System.out.println("Book not found");
			}
			else {
				System.out.println(b);
				
			}
		}
		}
		
		sc.close();
		
	}

}
