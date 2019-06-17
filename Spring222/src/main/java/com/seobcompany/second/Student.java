package com.seobcompany.second;

//jsp 화면에서 입력받은 것을 객체데이터로 만들기 위해서 만든 자바클래스
public class Student {
	public String name;
	public String address;
	public String birthday;
	public int idx;
	
	Student (int idx, String name, String address, String birthday) {
		this.idx = idx;
		this.name = name;
		this.address = address;
		this.birthday = birthday;
	}
}
