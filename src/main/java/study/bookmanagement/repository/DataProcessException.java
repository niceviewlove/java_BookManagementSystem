package study.bookmanagement.repository;

import java.sql.SQLException;

public class DataProcessException extends RuntimeException {

	public DataProcessException(SQLException e) {
		super(e);
	}
}
