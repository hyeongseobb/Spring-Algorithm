package com.seobcompany.third;

public class Student {
	public int idx;
	public String name;
	public String address;
	public String birthday;
	public String favoriteColor;
	
	//select할때 편하게 하기위해 만들어놓음
	//구조를 파악하기 위한 생성자
	public Student() {
		
	}
	
	//insert 실제 데이터 다룰때 편하게 하려고
	public Student(String name,String address, String birthday, String favoriteColor) {
		this.name = name;
		this.address = address;
		this.birthday = birthday;
		this.favoriteColor = favoriteColor;
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
		tagString = tagString + "<td>";
		tagString = tagString + this.favoriteColor;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + "<a href='modify?idx=" + this.idx + "'>수정하기</a>";
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + "<a href='delete?idx=" + this.idx + "'>삭제하기</a>";
		tagString = tagString + "</td>";
		tagString = tagString + "</tr>";
		return tagString;
	}
}
