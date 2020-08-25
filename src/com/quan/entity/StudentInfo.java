package com.quan.entity;

public class StudentInfo {
	private int stuno;
	private int stuage;
	private int score;
	public StudentInfo() {
	}
	public StudentInfo(int stuno,int stuage,int score) {
		this.stuno=stuno;
		this.stuage=stuage;
		this.score=score;
	}
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
	public int getStuage() {
		return stuage;
	}
	public void setStuage(int stuage) {
		this.stuage = stuage;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	
}
