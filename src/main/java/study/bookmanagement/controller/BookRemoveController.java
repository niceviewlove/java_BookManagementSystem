package study.bookmanagement.controller;

import study.bookmanagement.HttpRequest;
import study.bookmanagement.HttpResponse;
import study.bookmanagement.service.BookService;
import study.bookmanagement.util.NumberUtils;
import study.bookmanagement.util.validator.PlusNumberValidator;
import study.bookmanagement.util.validator.Validator;

public class BookRemoveController implements Controller {
	private BookService bookService = new BookService();
	
	@Override
	public HttpResponse<Integer> command(HttpRequest httpRequest) {
		int id = NumberUtils.parseInt(httpRequest.getAttribute("bookId"));
		
		Validator<Integer> plusNumberValidater = new PlusNumberValidator();
		plusNumberValidater.validate(id);
		bookService.removeBook(id);
		
		return new HttpResponse<>("200", id);
	}

}
 