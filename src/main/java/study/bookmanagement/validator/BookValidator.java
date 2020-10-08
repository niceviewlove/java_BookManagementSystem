package study.bookmanagement.validator;

import study.bookmanagement.book.Book;

public class BookValidator implements Validator<Book> {
	private PlusNumberValidator plusNumberValidator = new PlusNumberValidator();
	private YearValidator yearValidator = new YearValidator();
	private HasValueValidator hasValueValidator = new HasValueValidator();

	@Override
	public void validate(Book book) {
		hasValueValidator.validate(book.getTitle(), "title");
		hasValueValidator.validate(book.getAuthor(), "author");
		plusNumberValidator.validate(book.getStock());
		plusNumberValidator.validate(book.getPrice());
		yearValidator.validate(book.getYear());
	}

}
