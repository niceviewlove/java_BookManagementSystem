package study.bookmanagement.service;

import java.util.List;

import study.bookmanagement.repository.BookRepository;
import study.bookmanagement.repository.CategoryRepository;

public class BookService {
	private static BookService bookService = new BookService();
	
	private BookRepository bookRepository = BookRepository.getInstance();
	private CategoryRepository categoryRepository = CategoryRepository.getInstance();
	
	private BookService() {
	}
	
	public static BookService getInstance() {
		return bookService;
	}
	
	public void registerBook(Book book) {
		bookRepository.create(book);
	}
	
	public void updateBook(Book book) {
		bookRepository.update(book);
	}
	
	/**
	 * db에 값이 없으면 Exception, db에 값이 있으면 삭제
	 * @param bookId
	 */
	public void removeBook(Integer bookId) {
		Book book = bookRepository.findOneById(bookId);
		
		if (book == null) {
			throw new RuntimeException("존재하지 않는 데이터");
		}
		
		bookRepository.deleteById(bookId);
	}
	
	public List<Book> getBookList() {
		List<Book> bookList = bookRepository.findAllBooks();
		return bookList;
	}
	
	public List<Book> getCategoryBookList(Integer categoryId) {
		List<Book> bookList = bookRepository.findAllCategoryBooks(categoryId);
		return bookList;
	}

	public Book findOneBook(int id) {
		Book book = bookRepository.findOneById(id);
		Category category = categoryRepository.findOneById(book.getCategoryId());
		book.setCategory(category);
		return book;
	}
}


