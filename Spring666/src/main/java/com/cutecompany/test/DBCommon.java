package com.cutecompany.test;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBCommon<T> {
	private Connection connection;
//	private ArrayList<T> dataList;
	
	public DBCommon() {
	}
	
	private void open() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.110.112:1521:orcl",
					"kopo","kopo");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void close() {
		if (this.connection != null) {
			try {
				this.connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		this.connection = null;
	}
	
	public void insertData(T t) {
		try {
			Class<?> dataClass = t.getClass();
			// Class.forName("com.politech.student.Student")

			Field[] dataClassFields = dataClass.getDeclaredFields();
			// student.getClass().getSimpleName()
			String fieldString = "";
			String valueString = "";
			for (Field field : dataClassFields) {
				if (!fieldString.isEmpty()) {
					fieldString = fieldString + ",";
				}
				String fieldType = field.getType().toString();
				String fieldName = field.getName();
				if (fieldName.matches("idx")) {
					continue;
				}
				fieldString = fieldString + fieldName;
				if (!valueString.isEmpty()) {
					valueString = valueString + ",";
				}
				if (fieldType.matches(".*String")) {
					if (field.get(t) != null) {
						valueString = valueString + "" + field.get(t) + "";
					} else {
						valueString = valueString + "" + "null" + "";
					}
				} else {
					valueString = valueString + field.get(t);
				}
			}
			if (this.connection == null) {
				this.open();
			}
			String query = "INSERT INTO THECUTE (idx," + fieldString + ") VALUES(SEQ_IDX.NEXTVAL," + valueString + ")";
			System.out.println(query);
			Statement statement = this.connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}
	
	public void selectData() {
		try {
			if (this.connection == null) {
				this.open();
			}
			
			String query = "SELECT age, sex, sido, jobgroup, month FROM THECUTE WHERE 1=1 AND Q10GRADE = 76.48";
			System.out.println(query);
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			System.out.println(preparedStatement);
			
//			preparedStatement.setInt(1, 1);
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println(resultSet);

			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}
	
}
