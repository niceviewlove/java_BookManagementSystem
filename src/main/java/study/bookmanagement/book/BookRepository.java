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

//			stmt = conn.createStatement();
			pstm = conn.prepareStatement(query);
//			sql = "insert into books(title, author, stock, year, price)"
//			+ "values('"+book.getTitle()+"','" + book.getAuthor() + "','" + book.getStock() + "','" 
//			+ book.getYear() + "','" + book.getPrice() + "')";
			pstm.setString(1, book.getTitle());
			pstm.setString(2, book.getAuthor());
			pstm.setInt(3, book.getStock());
			pstm.setInt(4, book.getYear());
			pstm.setInt(5, book.getPrice());
			pstm.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch(SQLException e) {}
			}
		}
	}
	
	public void update(Book book) {
		try {
			stmt = conn.createStatement();
			//TODO 쿼리문 구현해야 한다.
//			sql = "update books set " + updateType + "='" + content +"' where book_id = "+ bookId;
			stmt.execute(sql);
			System.out.println(sql);
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch(SQLException e) {}
			}
		}
	}
	
	public void deleteById(Integer bookId) {
		try {
			stmt = conn.createStatement();
			sql = "delete from books "+"where book_id = "+ bookId;
			stmt.execute(sql);
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch(SQLException e) {}
			}
		}
	}
	
	public ArrayList<Book> findByAll() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		try {
			stmt = conn.createStatement();
			sql = "select * from books";
			rs = stmt.executeQuery(sql);
			
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
			stmt = conn.createStatement();
			String sql = "select * from books where book_id=" + bookId;
			rs = stmt.executeQuery(sql);
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
			if(stmt != null) {
				try {
					stmt.close();
				} catch(SQLException e) {}
			}
		}
		return null;
	}

}
