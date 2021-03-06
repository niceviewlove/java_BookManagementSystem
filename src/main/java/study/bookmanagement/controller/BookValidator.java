package study.bookmanagement.controller;

import study.bookmanagement.service.Book;
import study.bookmanagement.util.validator.HasValueValidator;
import study.bookmanagement.util.validator.NameLengthValidator;
import study.bookmanagement.util.validator.PlusNumberValidator;
import study.bookmanagement.util.validator.Validator;
import study.bookmanagement.util.validator.YearValidator;

public class BookValidator implements Validator<Book> {
	private PlusNumberValidator plusNumberValidator = new PlusNumberValidator();
	private YearValidator yearValidator = new YearValidator();
	private HasValueValidator hasValueValidator = new HasValueValidator();
	private TitleLengthValidator titleLengthValidator = new TitleLengthValidator();
	private NameLengthValidator nameLengthValidator = new NameLengthValidator();
	
	@Override
	public void validate(Book book) {
		//아래를 각각 TitleValidator에 넣고 
		hasValueValidator.validate(book.getTitle(), "title");
		titleLengthValidator.validate(book.getTitle());
		//AuthorValidator를 만들어 넣는 것이 좋은 것인가...?
		hasValueValidator.validate(book.getAuthor(), "author");
		nameLengthValidator.validate(book.getAuthor());
		
		plusNumberValidator.validate(book.getStock());
		plusNumberValidator.validate(book.getPrice());
		yearValidator.validate(book.getYear());
	}

}
