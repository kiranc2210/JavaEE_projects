package com.LearnersAcademy.model;

public class Status {

	public Status(){}
	
	private int studuentCount;
	private int teachersCount;
	
	public Status(int studuentCount, int teachersCount) {
		super();
		this.studuentCount = studuentCount;
		this.teachersCount = teachersCount;
	}
	
	public int getStuduentCount() {
		return studuentCount;
	}
	public void setStuduentCount(int studuentCount) {
		this.studuentCount = studuentCount;
	}
	public int getTeachersCount() {
		return teachersCount;
	}
	public void setTeachersCount(int teachersCount) {
		this.teachersCount = teachersCount;
	}
	
	
	
}
