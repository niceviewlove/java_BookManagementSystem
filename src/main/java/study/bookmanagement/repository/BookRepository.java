package study.bookmanagement.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import study.bookmanagement.DBConnetctionCreator;
import study.bookmanagement.service.Book;
import study.bookmanagement.util.DateUtils;

public class BookRepository {
	private static BookRepository bookRepository = new BookRepository();

	private BookRepository() {				
	}
	
	public static BookRepository getInstance() {
		return bookRepository;
	}
	
	public void create(Book book) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = DBConnetctionCreator.getInstance().getConnection();
			String query = "INSERT INTO BOOKS(categoryId, title, author, stock, year, price, created) VALUES(?, ?, ?, ?, ?, ?, ?)";
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, book.getCategoryId());
			pstm.setString(2, book.getTitle());
			pstm.setString(3, book.getAuthor());
			pstm.setInt(4, book.getStock());
			pstm.setInt(5, book.getYear());
			pstm.setInt(6, book.getPrice());
			pstm.setDate(7, DateUtils.getSqlDate(book.getCreatedDate()));
			pstm.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstm != null) {
				try {
					pstm.close();
				} catch(SQLException e) {}
			}
		}
	}
	
	public void update(Book book) {
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = DBConnetctionCreator.getInstance().getConnection();
			String query = "update books set title=?, author=?, stock=?, year=?, price=? where book_id=?";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, book.getTitle());
			pstm.setString(2, book.getAuthor());
			pstm.setInt(3, book.getStock());
			pstm.setInt(4, book.getYear());
			pstm.setInt(5, book.getPrice());
			pstm.setInt(6, book.getId());
			pstm.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstm != null) {
				try {
					pstm.close();
				} catch(SQLException e) {}
			}
		}
	}
	
	public void deleteById(Integer bookId) {
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = DBConnetctionCreator.getInstance().getConnection();
			String query = "delete from books where book_id=?";
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, bookId);
			pstm.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstm != null) {
				try {
					pstm.close();
				} catch(SQLException e) {}
			}
		}
	}
	
	public ArrayList<Book> findAllBooks() {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		try {
			conn = DBConnetctionCreator.getInstance().getConnection();
			String query = "select * from books";
			
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				Book book = new Book();
				
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setStock(rs.getInt("stock"));
				book.setYear(rs.getInt("year"));
				book.setPrice(rs.getInt("price"));
				
				bookList.add(book);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} 
		
		return bookList;
	}

	public ArrayList<Book> findAllCategoryBooks(Integer categoryId) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		try {
			conn = DBConnetctionCreator.getInstance().getConnection();
			String query = "select * from books where categoryId=?";
			
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				Book book = new Book();
				
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setStock(rs.getInt("stock"));
				book.setYear(rs.getInt("year"));
				book.setPrice(rs.getInt("price"));
				
				bookList.add(book);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} 
		
		return bookList;
	}
	
	public Book findOneById(Integer bookId) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnetctionCreator.getInstance().getConnection();
			String query = "select * from books where bookId=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, bookId);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				Book book = new Book();
				book.setTitle(rs.getString("title"));
				book.setAuthor(rs.getString("author"));
				book.setStock(rs.getInt("stock"));
				book.setYear(rs.getInt("year"));
				book.setPrice(rs.getInt("price"));
				return book;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstm != null) {
				try {
					pstm.close();
				} catch(SQLException e) {}
			}
		}
		return null;
	}

}
