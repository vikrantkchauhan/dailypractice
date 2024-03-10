package com.vikrant.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name ="mobile")
public class MobileNumber {
	
	@Id
	private int mid;
	private int mobno;
	
	@ManyToOne
	private Human human;

	

	@Override
	public String toString() {
		return "MobileNumber [mid=" + mid + ", mobno=" + mobno + ", human=" + human + "]";
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getMobno() {
		return mobno;
	}

	public void setMobno(int mobno) {
		this.mobno = mobno;
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}
	
	
	
	

}
