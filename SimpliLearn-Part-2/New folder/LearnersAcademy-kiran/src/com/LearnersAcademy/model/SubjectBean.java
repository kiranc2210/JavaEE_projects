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
	    
	   
	    private ClassBean cls;

	    @ManyToOne
	    @JoinColumn(name = "Class_ID")
	    public ClassBean getCls() {
			return cls;
		}

		public void setCls(ClassBean cls) {
			this.cls = cls;
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
