package com.seobcompany.wow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import javax.naming.spi.DirStateFactory.Result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sqlite.SQLiteConfig;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "index";
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public String post(Locale locale, Model model) {
		return "post";
	}
	
	@RequestMapping(value = "/post_list", method = RequestMethod.GET)
	public @ResponseBody ArrayList<HashMap> postList(Locale locale, Model model) {
		Connection connection = null;
		ArrayList<HashMap> data = new ArrayList<HashMap>();
		try {
			//1. DB 연결해서 열기!
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat(apache)\\ajax.db", config.toProperties());
			
			//2. 쿼리 만들기!
			String query = "SELECT * FROM post WHERE 1=1;";
			
			//3. 쿼리 실행시키기!
			System.out.println(query);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String name = resultSet.getString("title");
				String address = resultSet.getString("description");
				HashMap<String, String> row = new HashMap<String, String>();
				row.put("idx", "" + idx);
				row.put("title", name);
				row.put("description", address);
				data.add(row);
			}
			preparedStatement.close();
			//4. ***************DB 닫기!(꼭해주어야함)******************
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
	// DBCommon을 활용한 방법
//	@RequestMapping(value = "/user_info", method = RequestMethod.GET)
//	public @ResponseBody HashMap<String, String> userInfo(Locale locale, Model model) {
//		DBCommon<User> dbCommon = new DBCommon<User>("c:\\tomcat(apache)\\ajax.db", "user");
//		HashMap<String, String> data = new HashMap<String, String>();
//		data.put("user_info",dbCommon.selectDataTableTag(new User()));
//		return data;
//	}
	
	@RequestMapping(value = "/user_info", method = RequestMethod.GET)
	public @ResponseBody ArrayList<HashMap> userInfo(Locale locale, Model model) {
		Connection connection = null;
		ArrayList<HashMap> data = new ArrayList<HashMap>();
		try {
			//1. DB 연결해서 열기!
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat(apache)\\ajax.db", config.toProperties());
			
			//2. 쿼리 만들기!
			String query = "SELECT * FROM user WHERE 1=1;";
			
			//3. 쿼리 실행시키기!
			System.out.println(query);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				String birthday = resultSet.getString("birthday");
				HashMap<String, String> row = new HashMap<String, String>();
				row.put("idx", "" + idx);
				row.put("name", name);
				row.put("address", address);
				row.put("birthday", birthday);
				data.add(row);
			}
			preparedStatement.close();
			//4. ***************DB 닫기!(꼭해주어야함)******************
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody HashMap<String, String> update(Locale locale, Model model,
			@RequestParam("idx") String idx, @RequestParam("name") String name, @RequestParam("address") String address) {
		Connection connection = null;
		HashMap<String, String> result = new HashMap<String, String>();
		try {
			//1. DB 연결해서 열기!
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat(apache)\\ajax.db", config.toProperties());
			
			//2. 쿼리 만들기!
			String query = "UPDATE user SET " + "name=" + '"' + name + '"' + ", address=" + '"' + address + '"' +  " WHERE idx=" + idx + ";";
			
			//3. 쿼리 실행시키기!
			System.out.println(query);
			Statement statement = connection.createStatement();
			int q = statement.executeUpdate(query);
			statement.close();
			//4. ***************DB 닫기!(꼭해주어야함)******************
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//모든 api호출 할때는 request에 대한 return(response)을 발생시켜야함.
		result.put("result", "success");
		return result;
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public @ResponseBody HashMap<String, String> insert(Locale locale, Model model,
			@RequestParam("name") String name, @RequestParam("address") String address) {
		Connection connection = null;
		HashMap<String, String> result = new HashMap<String, String>();
		try {
			//1. DB 연결해서 열기!
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat(apache)\\ajax.db", config.toProperties());
			
			//2. 쿼리 만들기!
			String query = "INSERT INTO user " + "(name, address) VALUES(" + '"' + name + '"' + ", " + '"' + address + '"' + ");";
			
			//3. 쿼리 실행시키기!
			System.out.println(query);
			Statement statement = connection.createStatement();
			int q = statement.executeUpdate(query);
			statement.close();
			//4. ***************DB 닫기!(꼭해주어야함)******************
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//모든 api호출 할때는 request에 대한 return(response)을 발생시켜야함.
		result.put("result", "success");
		return result;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public @ResponseBody HashMap<String, String> delete(Locale locale, Model model,
			@RequestParam("idx") String idx) {
		Connection connection = null;
		HashMap<String, String> result = new HashMap<String, String>();
		try {
			//1. DB 연결해서 열기!
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat(apache)\\ajax.db", config.toProperties());
			
			//2. 쿼리 만들기!
			String query = "DELETE FROM user WHERE idx=" + idx + ";";
			
			//3. 쿼리 실행시키기!
			System.out.println(query);
			Statement statement = connection.createStatement();
			int q = statement.executeUpdate(query);
			statement.close();
			//4. ***************DB 닫기!(꼭해주어야함)******************
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//모든 api호출 할때는 request에 대한 return(response)을 발생시켜야함.
		result.put("result", "success");
		return result;
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public @ResponseBody ArrayList<HashMap> search(Locale locale, Model model,
			@RequestParam("keyword") String keyword) {
		Connection connection = null;
		ArrayList<HashMap> data = new ArrayList<HashMap>();
		try {
			//1. DB 연결해서 열기!
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat(apache)\\ajax.db", config.toProperties());
			
			//2. 쿼리 만들기!
			String query = "SELECT * FROM user WHERE 1=1 AND name like '%" + keyword + "%' OR address like '%" + keyword + "%';";
			
			//3. 쿼리 실행시키기!
			System.out.println(query);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				String birthday = resultSet.getString("birthday");
				HashMap<String, String> row = new HashMap<String, String>();
				row.put("idx", "" + idx);
				row.put("name", name);
				row.put("address", address);
				row.put("birthday", birthday);
				data.add(row);
			}
			preparedStatement.close();
			//4. ***************DB 닫기!(꼭해주어야함)******************
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public String details(Locale locale, Model model, @RequestParam String idx) {
		model.addAttribute("idx_string", idx);
		return "details";
	}
	
	@RequestMapping(value = "/post_details", method = RequestMethod.GET)
	public @ResponseBody HashMap<String, String> postDetails(Locale locale, Model model, @RequestParam String idx) {
		Connection connection = null;
		HashMap<String, String> data = new HashMap<String, String>();
		try {
			//1. DB 연결해서 열기!
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat(apache)\\ajax.db", config.toProperties());
			
			//2. 쿼리 만들기!
			String query = "SELECT * FROM post WHERE idx = "+ idx;
			
			//3. 쿼리 실행시키기!
			System.out.println(query);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				String title = resultSet.getString("title");
				String description = resultSet.getString("description");
				data.put("title", title);
				data.put("description", description);
			}
			preparedStatement.close();
			//4. ***************DB 닫기!(꼭해주어야함)******************
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
//	@RequestMapping(value = "/post_update", method = RequestMethod.POST)
//	public @ResponseBody HashMap<String, String> postUpdate(Locale locale, Model model,
//			@RequestParam("idx") String idx, @RequestParam("title") String title, @RequestParam("description") String description) {
//		Connection connection = null;
//		HashMap<String, String> result = new HashMap<String, String>();
//		try {
//			//1. DB 연결해서 열기!
//			Class.forName("org.sqlite.JDBC");
//			SQLiteConfig config = new SQLiteConfig();
//			connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat(apache)\\ajax.db", config.toProperties());
//			
//			//2. 쿼리 만들기!
//			String query = "UPDATE post SET " + "title=" + '"' + title + '"' + ", description=" + '"' + description + '"' +  " WHERE idx=" + idx + ";";
//			
//			//3. 쿼리 실행시키기!
//			System.out.println(query);
//			Statement statement = connection.createStatement();
//			int q = statement.executeUpdate(query);
//			statement.close();
//			//4. ***************DB 닫기!(꼭해주어야함)******************
//			connection.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		//모든 api호출 할때는 request에 대한 return(response)을 발생시켜야함.
//		result.put("result", "success");
//		return result;
//	}
		
}
