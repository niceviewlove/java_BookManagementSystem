package study.bookmanagement.member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class MemberRepository {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	
	String sql = "";
	
	public MemberRepository() {
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
	
	public void create(Member member) {
		try {
			String query = "INSERT INTO MEMBERS(name, gender, email, age, phone) VALUES(?, ?, ?, ?, ?)";

			pstm = conn.prepareStatement(query);
			pstm.setString(1, member.getName());
			pstm.setString(2, member.getGender());
			pstm.setString(3, member.getEmail());
			pstm.setInt(4, member.getAge());
			pstm.setString(5, member.getPhone());
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
}
