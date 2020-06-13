package com.sms.model;

public class Stat {

	public Stat(){}
	
	private int studuentCount;
	private int teachersCount;
	
	public Stat(int studuentCount, int teachersCount) {
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
