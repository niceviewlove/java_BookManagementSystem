package study.bookmanagement.controller;

import java.util.List;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Book;
import study.bookmanagement.service.BookService;

public class BookListController implements Controller {
	private BookService bookService = BookService.getInstance();
	
	@Override
	public HttpResponse<List<Book>> command(HttpRequest httpRequest) {
		try {
			System.out.println(System.currentTimeMillis() + " : " + getClass() + " : start");
			Thread.sleep(10000);
			System.out.println(System.currentTimeMillis() + " : " + getClass() + " : end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String params = (String) httpRequest.getParameter("categoryId");
		List<Book> bookList;
		
		if(params == null) {
			bookList = bookService.getBookList();
		} else {
			bookList = bookService.getCategoryBookList(Integer.parseInt(params));
		}
		
		return new HttpResponse<>("200", bookList);
	}
}
