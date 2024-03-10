package com.vikrant.manytomany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int pid;
	private String pname;

	@ManyToMany // if added(mappedBy ="project") then only one table
	// created that comtains relation between employee and project that
	// it will avoid the creation of table by the below statement
	// to change the name of the table created
	// that is classname and mapped object name nomenclature
	@JoinTable(name = "projject_employeerelation", joinColumns = {
			@JoinColumn(name = "projectids") }, inverseJoinColumns = { @JoinColumn(name = "employeeids") }) // for
																											// giving
																											// the names
																											// of column
																											// of the
																											// table
																											// created
																											// to hold
																											// the
																											// foreign
																											// key
																											// relation
	// and mapping
	private List<Employee> employee;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

}
