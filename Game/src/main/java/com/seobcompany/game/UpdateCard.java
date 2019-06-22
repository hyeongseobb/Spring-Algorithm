package com.seobcompany.game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

import org.sqlite.SQLiteConfig;

// DBCommon을 쿼리별로 쪼개서 사용할 줄 알아야함.
// 반대로 각각의 쿼리들을 합쳐서 DBCommon을 만들 줄 알아야함.
// ********** 만드는 순서 ***********
// DB열고 닫기(꼭 열었으면 다쓰고 닫아줘야함.)
// 쿼리 만들기
// 쿼리문을 실행시키기

public class UpdateCard {
	public void updateCardQuery(int idx) {
		try {
			//1. DB 연결해서 열기!
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/c:\\tomcat(apache)\\game.db", config.toProperties());
			
			//2. 쿼리 만들기!
			Random random = new Random();
			int attackPower = random.nextInt(100);
			int attackRate = random.nextInt(100);
			int defensePower = random.nextInt(100);
			int defenseRate = random.nextInt(100);
			String query = "UPDATE player SET attackPower=" + attackPower + ", attackRate=" + attackRate
					+ ", defensePower=" + defensePower + ", defenseRate=" + defenseRate + " WHERE idx=" + idx;
			
			//3. 쿼리 실행시키기!
			System.out.println(query);
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			System.out.println("result가 뭐야?" + result);
			statement.close();
			
			//4. ***************DB 닫기!(꼭해주어야함)******************
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
