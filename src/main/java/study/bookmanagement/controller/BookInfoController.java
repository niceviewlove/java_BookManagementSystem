package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Book;
import study.bookmanagement.service.BookService;

public class BookInfoController implements Controller {
	private BookService bookService = BookService.getInstance();

	@Override
	public HttpResponse<Book> command(HttpRequest httpRequest) {
		int id = Integer.parseInt((String)httpRequest.getParameter("id"));
		Book book = bookService.findOneBook(id);
		
		HttpResponse<Book> httpResponse = new HttpResponse<Book>("200", book);
		return httpResponse;
	}
}
