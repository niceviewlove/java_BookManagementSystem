package study.bookmanagement.repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import study.bookmanagement.service.Book;
import study.bookmanagement.service.Category;

public class CategoryRepository {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	  
	String sql = "";
	
	public CategoryRepository() {		
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
	
	public void create(Category category) {
		try {
			String query = "INSERT INTO categories(categoryName) VALUES(?)";
			
			pstm = conn.prepareStatement(query);
			pstm.setString(1, category.getName());
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
	
	public void update(Category category) {
		try {
			String query = "update categories set categoryName=? where categoryId=?";

			pstm = conn.prepareStatement(query);
			pstm.setString(1, category.getName());
			pstm.setInt(2, category.getId());
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
	
	public void deleteById(Integer categoryId) {
		try {
			String query = "delete from categories where categoryId?";
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, categoryId);
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
	
	public ArrayList<Category> findAllCategories() {
		ArrayList<Category> categoryList = new ArrayList<Category>();
		try {
			String query = "select * from categories";
			
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				Category category = new Category();
				category.setName(rs.getString("categoryName"));
				
				categoryList.add(category);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} 
		
		return categoryList;
	}
	
	public Category findOneById(Integer categoryId) {
		try {
			String query = "select * from categories where categoryId = ?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, categoryId);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				Category category = new Category();
				category.setName(rs.getString("categoryName"));
			
				return category;
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