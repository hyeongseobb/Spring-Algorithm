package com.seobcompany.fifth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JdbcTest {
	DataSource ds;
	
	public JdbcTest() {
		try {
			Context context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdvc/Oracle11g");		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public StringBuilder selectData() {
		StringBuilder htmlString = new StringBuilder();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ds.getConnection();
			String query = "SELECT age, sex, sido FROM THECUTE";
			preparedStatement = connection.prepareStatement(query);
			//preparedStatement.setInt(1, 1);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				htmlString.append("<tr>");
				String fieldName = resultSet.getString("");
				String age = resultSet.getString("age");
				String sex = resultSet.getString("sex");
				
				htmlString.append("<td>" + fieldName + "</td>");
				htmlString.append("<td>" + age + "</td>");
				htmlString.append("<td>" + sex + "</td>");
				htmlString.append("</tr>");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return htmlString;
	}
}
