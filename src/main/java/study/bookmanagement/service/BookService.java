package study.bookmanagement.service;

import java.util.List;

import study.bookmanagement.repository.BookRepository;

public class BookService {
	BookRepository bookRepository = new BookRepository();
	
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
	
	public List<Book> showBookList() {
		List<Book> bookList = bookRepository.findByAll();
		return bookList;
	}

	public Book findOneBook(int id) {
		Book book = bookRepository.findOneById(id);
		return book;
	}
}


