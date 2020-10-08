package study.bookmanagement.validator;

import study.bookmanagement.book.Book;

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
