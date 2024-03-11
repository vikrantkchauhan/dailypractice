package com.vikrant.onetomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="human")
public class Human {

	@Id
	private int id;

	private String name;

	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", mob=" + mob + "]";
	}

	@OneToMany(mappedBy = "human" , fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<MobileNumber> mob;

	public void setMob(List<MobileNumber> mob) {
		this.mob = mob;
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

}
