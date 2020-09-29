package study.bookmanagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookRepository {
	Connection conn = null;
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
	
	public void registerBookInfo(Book book) {
		try {
			stmt = conn.createStatement();
			sql = "insert into books(title, author, publisher, year, price)"
			+ "values('"+book.getTitle()+"','" + book.getAuthor() + "','" + book.getPublisher() + "','" 
			+ book.getYear() + "','" + book.getPrice() + "')";
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

}
