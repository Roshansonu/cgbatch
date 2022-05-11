package com.capg.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Library {
	@Id
	private int bookid;
	private String bookname;
	
	@ManyToMany(targetEntity = Student.class)
	private List stu;
	

	public List getStu() {
		return stu;
	}

	public void setStu(List stu) {
		this.stu = stu;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}



	public Library() {
		
	}
	

}
