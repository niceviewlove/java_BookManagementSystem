
package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.Book;
import study.bookmanagement.service.BookService;
import study.bookmanagement.util.NumberUtils;
import study.bookmanagement.util.StringUtils;

public class BookCreateController implements Controller {
	private BookValidator bookValidator = new BookValidator();
	private BookService bookService = new BookService();
	
	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		// 등록하려는 책 정보들을 파싱..? 
		
		String trimedTitle = StringUtils.trim(httpRequest.getAttribute("title"));
		String trimedAuthor = StringUtils.trim(httpRequest.getAttribute("author"));
		int stockNumber = NumberUtils.parseInt(httpRequest.getAttribute("stock"));
		int yearNumber = NumberUtils.parseInt(httpRequest.getAttribute("year"));
		int priceNumber = NumberUtils.parseInt(httpRequest.getAttribute("price"));

		Book book = new Book(trimedTitle, trimedAuthor, stockNumber, yearNumber, priceNumber);
		bookValidator.validate(book);
		bookService.registerBook(book);
		
		return new HttpResponse<>("200", book.getId());
		
	}
}
