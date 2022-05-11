package com.capg.entity;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private long fees;
	
	@ManyToMany(targetEntity = Library.class)
	private List lib;

	
	public List getLib() {
		return lib;
	}
	public void setLib(List lib) {
		this.lib = lib;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getFees() {
		return fees;
	}
	public void setFees(long fees) {
		this.fees = fees;
	}
	

	public Student() {
	
	}
	


}
