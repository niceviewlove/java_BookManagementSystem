
package study.bookmanagement.controller;

import java.util.Date;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Book;
import study.bookmanagement.service.BookService;
import study.bookmanagement.util.DateUtils;
import study.bookmanagement.util.NumberUtils;
import study.bookmanagement.util.StringUtils;

public class BookCreateController implements Controller {
	private BookValidator bookValidator = new BookValidator();
	private BookService bookService = BookService.getInstance();
	
	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {	
		try {
			System.out.println(getClass() + " : start");
			Thread.sleep(10000);
			System.out.println(getClass() + " : end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int categoryIdNumber = NumberUtils.parseInt((String)httpRequest.getAttribute("category_id"));
		String trimedTitle = StringUtils.trim((String)httpRequest.getAttribute("title"));
		String trimedAuthor = StringUtils.trim((String)httpRequest.getAttribute("author"));
		int stockNumber = NumberUtils.parseInt((String)httpRequest.getAttribute("stock"));
		int yearNumber = NumberUtils.parseInt((String)httpRequest.getAttribute("year"));
		int priceNumber = NumberUtils.parseInt((String)httpRequest.getAttribute("price"));
		Date created = DateUtils.getDate((String)httpRequest.getAttribute("created"));

		Book book = new Book(categoryIdNumber, trimedTitle, trimedAuthor, stockNumber, yearNumber, priceNumber, created);
		bookValidator.validate(book);
		bookService.registerBook(book);
		
		return new HttpResponse<>("200", book.getId());
//		return new HttpResponse<>("200", 1);
		
	}
}
