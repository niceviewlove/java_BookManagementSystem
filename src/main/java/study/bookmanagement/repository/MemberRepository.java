package study.bookmanagement.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import study.bookmanagement.servicce.Book;
import study.bookmanagement.servicce.Member;

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
	
	public void update(Member member) {
		try {
			String query = "UPDATE members set name=?, gender=?, email=?, age=?, phone=? where member_id=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, member.getName());
			pstm.setString(2, member.getGender());
			pstm.setString(3, member.getEmail());
			pstm.setInt(4, member.getAge());
			pstm.setString(5, member.getPhone());
			pstm.setInt(6, member.getId());
			
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
	
	public void deleteById(Integer memberId) {
		try {
			String query = "DELETE FROM MEMBERS WHERE member_id" + "= ?";
			
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, memberId);
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
	
	public ArrayList<Member> findByAll() {
		ArrayList<Member> memberList = new ArrayList<Member>();
		try {
			String query = "SELECT * FROM MEMBERS";

			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				Member member = new Member();
				
				member.setName(rs.getString("name"));
				member.setGender(rs.getString("gender"));
				member.setEmail(rs.getString("email"));
				member.setAge(rs.getInt("age"));
				member.setPhone(rs.getString("phone"));
				
				memberList.add(member);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} 
		
		return memberList;
	}
	
	public Member findOneById(Integer memberId) {
		try {
			String query = "SELECT * FROM MEMBERS " + "WHERE member_id LIKE ?";
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, memberId);
			rs = pstm.executeQuery();
			if(rs.next()) {
				Member member = new Member();
				member.setName(rs.getString("name"));
				member.setGender(rs.getString("gender"));
				member.setEmail(rs.getString("email"));
				member.setAge(rs.getInt("age"));
				member.setPhone(rs.getString("phone"));
				
				return member;
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
