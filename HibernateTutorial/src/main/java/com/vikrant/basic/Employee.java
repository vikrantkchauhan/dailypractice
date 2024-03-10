/**
 * 
 */
package com.vikrant.basic;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author vikrant.chauhan01
 *
 */

@Entity(name = "employee") // setting the entity name
@Table(name = "employee_details")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "emp_id")
	private int emp_id;
	@Column(name = "emp_name")
	private String name;
	@Column(name = "emp_city")
	private String city;

	public Employee(int id, int emp_id, String name, String city) {
		super();
		this.id = id;
		this.emp_id = emp_id;
		this.name = name;
		this.city = city;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
