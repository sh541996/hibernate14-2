package com.vp;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee extends Person{
	
	@Column(name="joining_date")
    private Date joiningDate;	

	@Column(name="department_name")
	private String departmentName;
	
	public Date getJoiningDate() {
		return joiningDate;
	}
/*
	SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
	String dateString = "15-10-2008";
	Date date = format.parse(dateString);
	System.out.println(format.format(date));
	*/
	
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public Employee() {
	}
	
	public Employee(String firstname, String lastname, Date joiningDate, String departmentName) {
		super(firstname, lastname);
		this.joiningDate = joiningDate;
		this.departmentName = departmentName;
	}
}