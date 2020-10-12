package study.bookmanagement.controller;

import java.util.List;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.servicce.Book;
import study.bookmanagement.servicce.BookService;

public class BookListController implements Controller{
	private BookService bookService = new BookService();
	
	@Override
	public HttpResponse<List<Book>> command(HttpRequest httpRequest) {
		List<Book> bookList = bookService.showBookList();
		
//		System.out.println("제목\t\t저자\t\t재고\t\t출판년도\t\t가격");
//		for(Book book : bookList) {
//			System.out.println(book.getTitle() + "\t\t" + book.getAuthor() + "\t\t" +
//			    book.getStock() + "\t\t" + book.getYear() + "\t\t" + book.getPrice());
//		}
		
		return new HttpResponse<>("200", bookList);
	}
}
