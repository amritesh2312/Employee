package com.LeaveApp.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.Id;
@Entity
@Table(name="employee_details")
public class EmployeeDetails {

	@Id
	@Column(name="empid")
	@Pattern(regexp="[0-9]{6}",message="ID should be 6 digit")
	private int empid;
	@Column(name="ename")
	private String ename;
	@Column(name="address")
	private String address;
	@Column(name="leaves_avail")
	private int leave_avail;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLeave_avail() {
		return leave_avail;
	}
	public void setLeave_avail(int leave_avail) {
		this.leave_avail = leave_avail;
	}
	
	
}
