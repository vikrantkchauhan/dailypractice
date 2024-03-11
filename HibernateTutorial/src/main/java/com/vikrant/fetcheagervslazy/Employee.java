package com.vikrant.fetcheagervslazy;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="e")
public class Employee {
	
	@Id
	private int id;
	private String name;
	
	public List<Mobile> getMb() {
		return mb;
	}
	public void setMb(List<Mobile> mb) {
		this.mb = mb;
	}
	@OneToMany(mappedBy = "emp")
	private List<Mobile> mb;
	
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
	
	

}
