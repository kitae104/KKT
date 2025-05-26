package database.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/C-Ban?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8", 
					"root", "root1234");
			
			Statement stmt= conn.createStatement();
			String insertSQL = "INSERT INTO member(name, dept, code, grade, score) VALUES(?,?,?,?,?)";
			
			PreparedStatement pstmt = conn.prepareStatement(insertSQL);
			pstmt.setString(1, "박지성");
			pstmt.setString(2, "컴시과");
			pstmt.setString(3, "45005");
			pstmt.setInt(4,3);
			pstmt.setDouble(5, 4.5);
			
			int num = pstmt.executeUpdate();
			if(num > 0) {
				System.out.println("입력 성공");
			} else {
				System.out.println("입력 실패!!");
			}
			
			String selectSQL = "SELECT * FROM member";
			ResultSet rs = stmt.executeQuery(selectSQL);
			
			System.out.println(
					"id" + "\t" + 
					"name" + "\t" + 
					"dept" + "\t" + 
					"code" + "\t" + 
					"grade" + "\t" + 
					"score");
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString("name");
				String dept = rs.getString("dept");
				String code = rs.getString("code");
				int grade = rs.getInt("grade");
				double score = rs.getDouble("score");
				
				
				System.out.println(
					id + "\t" + 
					name + "\t" + 
					dept + "\t" + 
					code + "\t" + 
					grade + "\t" + 
					score);
			}
			
			
			
			System.out.println("OK");
		} catch (ClassNotFoundException e) {
			System.err.println("해당 드라이버를 찾지 못했습니다 : ");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("SQL 오류 발생 : ");
			e.printStackTrace();
		}

	}

}
