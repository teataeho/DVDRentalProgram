package com.java.order.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.java.common.DataBaseConnection;

public class OrderRepository {

	private DataBaseConnection connection
			= DataBaseConnection.getInstance();

	public void addOrder(int movieNumber, int userNumber) {
		
		String sql = "INSERT INTO order_history "
				+ "(order_no, user_number, serial_number) "
				+ "VALUES(order_seq.NEXTVAL,?,?)";
		
		try(Connection conn = connection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, userNumber);
			pstmt.setInt(2, movieNumber);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
