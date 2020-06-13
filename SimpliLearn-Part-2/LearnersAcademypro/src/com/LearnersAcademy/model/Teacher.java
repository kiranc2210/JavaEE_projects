package com.LearnersAcademy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TEACHER")
public class Teacher {

   @Id
   @GeneratedValue
   @Column(name = "Teacher_ID")
   private long id;

   @Column(name = "FIRST_NAME")
   private String firstName;

   @Column(name = "LAST_NAME")
   private String lastName;

   @Column(name = "SECTION")
   private String section;

   @ManyToOne(optional = false)
   @JoinColumn(name="CLASS_ID")
   private Classe clas;
   
   @OneToOne(optional = false)
   @JoinColumn(name="SUBJECT_ID")
   private Subject subject;


   public Teacher() {
   }

   public Teacher(String firstName, String lastName, String section) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.section = section;
   }

   public long getId() {
       return id;
   }

   public void setId(long id) {
       this.id = id;
   }

   public String getFirstName() {
       return firstName;
   }

   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }

   public String getLastName() {
       return lastName;
   }

   public void setLastName(String lastName) {
       this.lastName = lastName;
   }

   public String getSection() {
       return section;
   }

   public Classe getClas() {
		return clas;
	}

	public void setClas(Classe clas) {
		this.clas = clas;
	}

	public void setSection(String section) {
       this.section = section;
   }



   @Override
   public String toString() {
       return "Teacher [id=" + id + ", firstName=" + firstName + ", lastName="
               + lastName + ", section=" + section + "]";
   }
}
