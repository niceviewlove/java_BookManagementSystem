package study.bookmanagement.book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookRepository {
	Connection conn = null;
	PreparedStatement pstm = null;
	Statement stmt = null;
	ResultSet rs = null;
	  
	String sql = "";
	
	public BookRepository() {		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/siondb";
			conn = DriverManager.getConnection(url, "sion", "1234");
			System.out.println("Connected to DB!");
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch(Exception e) {
			System.out.println("에러: "+e);
		} 
	}
	
	public void create(Book book) {
		try {
			String query = "INSERT INTO BOOKS(title, author, stock, year, price) VALUES(?, ?, ?, ?, ?)";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, book.getTitle());
			pstm.setString(2, book.getAuthor());
			pstm.setInt(3, book.getStock());
			pstm.setInt(4, book.getYear());
			pstm.setInt(5, book.getPrice());
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
		try {
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
		try {
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
	
	public ArrayList<Book> findByAll() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		try {
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

	public Book findOneById(Integer bookId) {
		try {
			String query = "select * from books where book_id=?";
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
