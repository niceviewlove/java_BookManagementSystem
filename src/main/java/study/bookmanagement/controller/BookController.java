package study.bookmanagement.controller;
import java.util.List;

import study.bookmanagement.servicce.Book;
import study.bookmanagement.servicce.BookService;
import study.bookmanagement.util.validator.PlusNumberValidator;
import study.bookmanagement.util.validator.Validator;

public class BookController {  //유효성 체크
	private BookValidator bookValidator = new BookValidator();
	private BookService bookService = new BookService();
	
	public void register(String title,String author, String stock, String year, String price) {
		String trimedTitle = title.trim();
		String trimedAuthor = author.trim();
		int stockNumber = Integer.parseInt(stock);
		int yearNumber = Integer.parseInt(year);
		int priceNumber = Integer.parseInt(price);

		Book book = new Book(trimedTitle, trimedAuthor, stockNumber, yearNumber, priceNumber);
		bookValidator.validate(book);
		bookService.registerBook(book);
	};
	
	public void update(String bookId, String title, String author, String stock, String year, String price) {
		int bookIdNumber = Integer.parseInt(bookId);
		int stockNumber = Integer.parseInt(stock);
		int yearNumber = Integer.parseInt(year);
		int priceNumber = Integer.parseInt(price);
		
		
		Book book = new Book(title, author, stockNumber, yearNumber, priceNumber);
		book.setId(bookIdNumber);
		bookValidator.validate(book);
		bookService.updateBook(book);
	};
	
	public void remove(String bookId) {
		Integer id = Integer.parseInt(bookId);
		Validator<Integer> plusNumberValidater = new PlusNumberValidator();
		plusNumberValidater.validate(id);
		bookService.removeBook(id);
	}
	
	public void showBookList() {
		List<Book> bookList = bookService.showBookList();
		
		System.out.println("제목\t\t저자\t\t재고\t\t출판년도\t\t가격");
		for(Book book : bookList) {
			System.out.println(book.getTitle() + "\t\t" + book.getAuthor() + "\t\t" +
			    book.getStock() + "\t\t" + book.getYear() + "\t\t" + book.getPrice());
		}
	}

}
