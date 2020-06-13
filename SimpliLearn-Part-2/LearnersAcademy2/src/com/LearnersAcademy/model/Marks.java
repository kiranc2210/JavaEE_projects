package com.LearnersAcademy.model;

public class Marks {
	private String student_id;
	
	private String student_name;
	private String english;
	private String kannada;
	private String mathematics;
	private String science;
	private String computer_science;
	private String commerce;
	private String music;
	private String dancing;
	private String drawing;

	
	public Marks(){}

	public Marks(String student_id, String student_name, String english, String kannada, String mathematics, String science,
			String computer_science, String commerce, String music, String dancing, String drawing, String health,
			String geography, String history, String religion) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.english = english;
		this.kannada = kannada;
		this.mathematics = mathematics;
		this.science = science;
		this.computer_science = computer_science;
		this.commerce = commerce;
		this.music = music;
		this.dancing = dancing;
		this.drawing = drawing;
		
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getKannada() {
		return kannada;
	}

	public void setKannada(String kannada) {
		this.kannada = kannada;
	}

	public String getMathematics() {
		return mathematics;
	}

	public void setMathematics(String mathematics) {
		this.mathematics = mathematics;
	}

	public String getScience() {
		return science;
	}

	public void setScience(String science) {
		this.science = science;
	}

	public String getComputer_science() {
		return computer_science;
	}

	public void setComputer_science(String computer_science) {
		this.computer_science = computer_science;
	}

	public String getCommerce() {
		return commerce;
	}

	public void setCommerce(String commerce) {
		this.commerce = commerce;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public String getDancing() {
		return dancing;
	}

	public void setDancing(String dancing) {
		this.dancing = dancing;
	}

	public String getDrawing() {
		return drawing;
	}

	public void setDrawing(String drawing) {
		this.drawing = drawing;
	}



	@Override
	public String toString() {
		return "Marks [student_id=" + student_id + ", student_name=" + student_name + ", english=" + english + ", kannada=" + kannada
				+ ", mathematics=" + mathematics + ", science=" + science + ", computer_science=" + computer_science
				+ ", commerce=" + commerce + ", music=" + music + ", dancing=" + dancing + ", drawing=" + drawing
				+ ", health="
				+ "]";
	}


	
	
	
	
	
	
}
