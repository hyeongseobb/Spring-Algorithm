package com.seobcompany.finalexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.sqlite.SQLiteConfig;

public class SearchData {
	public StringBuilder searchDataQuery(String keyword) {
		StringBuilder htmlString = new StringBuilder();
		try {
			//1. DB 연결해서 열기!
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat(apache)\\student.db", config.toProperties());
			
			//2. 쿼리 만들기!
			String query = "SELECT * FROM student WHERE 1=1 AND name like '%" + keyword + "%';";
			
			//3. 쿼리 실행시키기!
			System.out.println(query);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				htmlString.append("<tr>");
				String fieldName = resultSet.getString("name");
				int idx = resultSet.getInt("idx");
				String midScore = resultSet.getString("midScore");
				String finalScore = resultSet.getString("finalScore");
				
				htmlString.append("<td>" + idx + "</td>");
				htmlString.append("<td>" + fieldName + "</td>");
				htmlString.append("<td>" + midScore + "</td>");
				htmlString.append("<td>" + finalScore + "</td>");
				htmlString.append("</tr>");
			}
			preparedStatement.close();

			//4. ***************DB 닫기!(꼭해주어야함)******************
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return htmlString;
	}
}
