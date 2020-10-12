package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.servicce.Book;
import study.bookmanagement.servicce.BookService;

public class BookInfoController implements Controller {
	private BookService bookService = new BookService();

	@Override
	public HttpResponse<Book> command(HttpRequest httpRequest) {
		int id = Integer.parseInt(httpRequest.getParameter("id"));
		Book book = bookService.findOne(id);
		
		HttpResponse<Book> httpResponse = new HttpResponse<Book>("200", book);
		return httpResponse;
	}
}
