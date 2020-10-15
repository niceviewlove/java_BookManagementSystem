package study.bookmanagement.controller;

import java.util.List;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Book;
import study.bookmanagement.service.BookService;

public class BookListController implements Controller {
	private BookService bookService = new BookService();
	
	@Override
	public HttpResponse<List<Book>> command(HttpRequest httpRequest) {
		String params = httpRequest.getParameter("categoryId");
		List<Book> bookList;
		
		if(params == null) {
			bookList = bookService.getBookList();
		} else {
			bookList = bookService.getCategoryBookList(Integer.parseInt(params));
		}
		
		return new HttpResponse<>("200", bookList);
	}
}
