package com.mycompany.app.LibraryTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mycompany.app.books.Book;
import com.mycompany.app.library.LibraryCatalog;

public class LibraryTest {
	
	@Test
	public void sample()
	{
		assertTrue(true);
	}
	
	@Test
	public void test_add_book()
	{
		LibraryCatalog libraryCatalog = new LibraryCatalog();
		Book book1 = new Book("any_book","any_author");
		libraryCatalog.addBook(book1);
		
		List<Book> books = new ArrayList<>();
		books.add(book1);
		
		assertTrue(libraryCatalog.getBooks().size() == 1);
		assertEquals(libraryCatalog.getBooks(),books);
	}
	
	@Test
	public void test_borrow_book()
	{
		LibraryCatalog libraryCatalog = new LibraryCatalog();
		Book book1 = new Book("any_book","any_author");
		libraryCatalog.addBook(book1);
		libraryCatalog.borrowBook("any_book");
		List<Book> res_books = libraryCatalog.getBooks();
		for(Book x:res_books)
		{
			if(x.getTitle().equals(book1.getTitle()))
			{
				assertFalse(x.isAvailable());
			}
		}
	}
}
