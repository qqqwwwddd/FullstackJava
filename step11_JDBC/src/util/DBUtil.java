package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DBUtil : 객체와 상관없이 누구나 가져다 쓸수 있음 
public class DBUtil {
	// step01 *공통
	// Driver 로딩
	// 표준 (형식정해져있음) - Class.forName("com.mysql.cj.jdbc.Driver");
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// DB 연결 기능 메소드
	// 객체를 돌려줄 타입 = Connection
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "");
	}

	// DB 자원반환(close) 메소드
	public static void close(ResultSet rset, Statement stmt, Connection conn) {
		try {
			if (rset != null) {
				rset.close();
				rset = null;
			}

			if (stmt != null) {
				stmt.close();
				stmt = null;
			}

			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) { // 위에서 사용하는로직있는데 finally 할필요 x
			e.printStackTrace();

		}
	}

	public static void close(Statement stmt, Connection conn) {
		try {

			if (stmt != null) {
				stmt.close();
				stmt = null;
			}

			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) { // 위에서 사용하는로직있는데 finally 할필요 x
			e.printStackTrace();

		}
	}
}
