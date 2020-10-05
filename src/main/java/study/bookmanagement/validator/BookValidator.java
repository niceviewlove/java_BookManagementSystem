package study.bookmanagement.validator;

import study.bookmanagement.book.Book;

public class BookValidator implements Validator<Book> {
	private NonSpaceValidator nonSpaceValidator = new NonSpaceValidator();
	private PlusNumberValidator plusNumberValidator = new PlusNumberValidator();
	private YearValidator yearValidator = new YearValidator();

	@Override
	public void validate(Book book) {
		nonSpaceValidator.validate(book.getTitle());
		nonSpaceValidator.validate(book.getAuthor());
		plusNumberValidator.validate(book.getStock());
		plusNumberValidator.validate(book.getPrice());
		yearValidator.validate(book.getYear());
	}

}
