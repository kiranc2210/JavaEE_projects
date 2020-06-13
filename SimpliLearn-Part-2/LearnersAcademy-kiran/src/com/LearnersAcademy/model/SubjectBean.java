package com.LearnersAcademy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SubjectBean")
public class SubjectBean {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int sub_id;
	    private String sub_name;
	    
	    @ManyToOne(optional = false)
	    @JoinColumn(name="CLASS_ID")
	    private ClassBean clas;
	    
	    public ClassBean getCls() {
			return clas;
		}

		public void setCls(ClassBean clas) {
			this.clas = clas;
		}

		public int getSub_id() {
	        return sub_id;
	    }

	    public String getSub_name() {
	        return sub_name;
	    }

	    public void setSub_name(String sub_name) {
	        this.sub_name = sub_name;
	    }

}
