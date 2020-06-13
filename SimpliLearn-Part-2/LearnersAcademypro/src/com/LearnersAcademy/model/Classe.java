package com.LearnersAcademy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "CLASS")
public class Classe {
 
    @Id
    @GeneratedValue
    @Column(name = "CLASS_ID")
    private long id;
 
    @Column(name = "NAME")
    private String name;
 
    public Classe() {
 
    }
 
    public Classe(String name, String country) {
        this.name = name;
       
    }
 
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
 
 
    @Override
    public String toString() {
        return "Class [id=" + id + ", name=" + name + "]";
    }
 
}