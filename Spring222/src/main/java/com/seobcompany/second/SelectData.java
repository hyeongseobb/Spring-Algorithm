package com.seobcompany.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.sqlite.SQLiteConfig;

public class SelectData {
	int countSeoul = 0;
	int countGyeonggi = 0;
	
	ArrayList<Student> students = new ArrayList<Student>();
	public void selectStudent() {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (Exception e) {
			e.printStackTrace();
		}
		SQLiteConfig config = new SQLiteConfig();
		try {
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat(apache)\\student.sqlite", config.toProperties());
			String query = "SELECT * FROM student WHERE ?;";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, 1);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				this.students.add(new Student(resultSet.getInt("idx"), resultSet.getString("name"), resultSet.getString("address"), resultSet.getString("birthday")));
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public String getHtmlString() {
		String htmlString = "";
		for (int i = 0; i < this.students.size(); i++) {
			htmlString = htmlString + "<tr>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + this.students.get(i).idx;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + this.students.get(i).name;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + this.students.get(i).address;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "<td>";
			htmlString = htmlString + this.students.get(i).birthday;
			htmlString = htmlString + "</td>";
			htmlString = htmlString + "</tr>";
		}
		return htmlString;
	}
	public String getHtmlCountValue() {
		for (int i = 0; i < this.students.size(); i++) {
			if (this.students.get(i).address.contains("서울")) {
				countSeoul++;
			} else if (this.students.get(i).address.contains("경기")) {
				countGyeonggi++;
			} 
		}
		System.out.printf("서울에 사는인구: %d, 경기도에 사는인구: %d", countSeoul, countGyeonggi);
		String HtmlCount = "";
		HtmlCount = HtmlCount + "<span>"+ "서울에 사는인구: "+ countSeoul + ", 경기도에 사는인구: " + countGyeonggi + "</span>";
		return HtmlCount;
	}
}
