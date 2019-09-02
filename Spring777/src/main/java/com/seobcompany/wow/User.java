package com.seobcompany.wow;

public class User {
	public int idx;
	public String name;
	public String address;
	public String birthday;
	
	//select할때 편하게 하기위해 만들어놓음
	//구조를 파악하기 위한 생성자
	public User() {
		
	}
	
	//insert 실제 데이터 다룰때 편하게 하려고
	public User(String name,String address, String birthday) {
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	}
	
	public String toTableTagString() {
		String tagString = "";
		tagString = tagString + "<tr>";
		tagString = tagString + "<td>";
		tagString = tagString + this.idx;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.name;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.address;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.birthday;
		tagString = tagString + "</td>";
		tagString = tagString + "</tr>";
		return tagString;
	}
}
