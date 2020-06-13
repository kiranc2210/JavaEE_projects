package com.sms.model;

import java.sql.Date;

public class Notices {

	private int note_id;
	private String note_topic;
	private String note_body;
	private Date dateOfExpire;

	public Notices(){}

	public Notices(int note_id, String note_topic, String note_body, Date dateOfExpire) {
		super();
		this.note_id = note_id;
		this.note_topic = note_topic;
		this.note_body = note_body;
		this.dateOfExpire = dateOfExpire;
	}

	public int getNote_id() {
		return note_id;
	}

	public void setNote_id(int note_id) {
		this.note_id = note_id;
	}

	public String getNote_topic() {
		return note_topic;
	}

	public void setNote_topic(String note_topic) {
		this.note_topic = note_topic;
	}

	public String getNote_body() {
		return note_body;
	}

	public void setNote_body(String note_body) {
		this.note_body = note_body;
	}

	public Date getDateOfExpire() {
		return dateOfExpire;
	}

	public void setDateOfExpire(Date dateOfExpire) {
		this.dateOfExpire = dateOfExpire;
	}

	@Override
	public String toString() {
		return "Notices [note_id=" + note_id + ", note_topic=" + note_topic + ", note_body=" + note_body
				+ ", dateOfExpire=" + dateOfExpire + "]";
	}

	
}
