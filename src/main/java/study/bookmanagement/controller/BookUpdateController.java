package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Book;
import study.bookmanagement.service.BookService;
import study.bookmanagement.util.NumberUtils;
import study.bookmanagement.util.StringUtils;

public class BookUpdateController implements Controller {
	private BookValidator bookValidator = new BookValidator();
	private BookService bookService = new BookService();

	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		int categoryIdNumber = NumberUtils.parseInt(httpRequest.getAttribute("category_id"));
		String trimedTitle = StringUtils.trim(httpRequest.getAttribute("title"));
		String trimedAuthor = StringUtils.trim(httpRequest.getAttribute("author"));
		int bookIdNumber = NumberUtils.parseInt(httpRequest.getAttribute("bookId"));
		int stockNumber = NumberUtils.parseInt(httpRequest.getAttribute("stock"));
		int yearNumber = NumberUtils.parseInt(httpRequest.getAttribute("year"));
		int priceNumber = NumberUtils.parseInt(httpRequest.getAttribute("price"));	
				
		
		Book book = new Book(categoryIdNumber, trimedTitle, trimedAuthor, stockNumber, yearNumber, priceNumber);
		book.setId(bookIdNumber);
		bookValidator.validate(book);
		bookService.updateBook(book);
		
		return new HttpResponse<>("200", book.getId());
	}

}
