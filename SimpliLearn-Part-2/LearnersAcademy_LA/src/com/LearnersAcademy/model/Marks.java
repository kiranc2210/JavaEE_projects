package com.LearnersAcademy.model;

public class Marks {
	private String student_id;
	
	private String kannada;
	private String english;
	private String hindi;
	private String mathematics;
	private String science;
	private String computer_science;
	private String commerce;
	private String music;
	private String dancing;
	private String drawing;

	
	public Marks(){}

	public Marks(String student_id, String kannada, String english, String hindi, String mathematics, String science,
			String computer_science, String commerce, String music, String dancing, String drawing, String health,
			String geography, String history, String religion) {
		super();
		this.student_id = student_id;
		this.kannada = kannada;
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

	public String getKannada() {
		return kannada;
	}

	public void setKannada(String kannada) {
		this.kannada = kannada;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getHindi() {
		return hindi;
	}

	public void setHindi(String hindi) {
		this.hindi = hindi;
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
		return "Marks [student_id=" + student_id + ", kannada=" + kannada + ", english=" + english + ", hindi=" + hindi
				+ ", mathematics=" + mathematics + ", science=" + science + ", computer_science=" + computer_science
				+ ", commerce=" + commerce + ", music=" + music + ", dancing=" + dancing + ", drawing=" + drawing
				+ ", health="
				+ "]";
	}


	
	
	
	
	
	
}
