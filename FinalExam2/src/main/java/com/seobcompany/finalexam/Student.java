package com.seobcompany.finalexam;

public class Student {
	public int idx;
	public String name;
	public String midScore;
	public String finalScore;
	
	Student() {
		
	}
	Student(String name, String midScore, String finalScore) {
		this.name = name;
		this.midScore = midScore;
		this.finalScore = finalScore;
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
		tagString = tagString + this.midScore;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + this.finalScore;
		tagString = tagString + "</td>";
		tagString = tagString + "<td>";
		tagString = tagString + "<a href='/finalexam/update?idx=" + this.idx + "'>수정하기</a>";
		tagString = tagString + "</td>";
		tagString = tagString + "</tr>";
		return tagString;
	}
}
