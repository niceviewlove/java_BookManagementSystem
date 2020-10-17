package study.bookmanagement.controller;

import java.util.Date;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Book;
import study.bookmanagement.service.BookService;
import study.bookmanagement.util.DateUtils;
import study.bookmanagement.util.NumberUtils;
import study.bookmanagement.util.StringUtils;

public class BookUpdateController implements Controller {
	private BookValidator bookValidator = new BookValidator();
	private BookService bookService = BookService.getInstance();

	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		int categoryIdNumber = NumberUtils.parseInt((String)httpRequest.getAttribute("category_id"));
		String trimedTitle = StringUtils.trim((String)httpRequest.getAttribute("title"));
		String trimedAuthor = StringUtils.trim((String)httpRequest.getAttribute("author"));
		int bookIdNumber = NumberUtils.parseInt((String)httpRequest.getAttribute("bookId"));
		int stockNumber = NumberUtils.parseInt((String)httpRequest.getAttribute("stock"));
		int yearNumber = NumberUtils.parseInt((String)httpRequest.getAttribute("year"));
		int priceNumber = NumberUtils.parseInt((String)httpRequest.getAttribute("price"));
		Date created = DateUtils.getDate((String)httpRequest.getAttribute("created"));
				
		
		Book book = new Book(categoryIdNumber, trimedTitle, trimedAuthor, stockNumber, yearNumber, priceNumber, created);
		book.setId(bookIdNumber);
		bookValidator.validate(book);
		bookService.updateBook(book);
		
		return new HttpResponse<>("200", book.getId());
	}

}
