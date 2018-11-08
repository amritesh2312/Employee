package com.LeaveApp.beans;

import java.time.LocalDate;

public class EmployeeLeaveDetails {

	private int leave_id;
	private int empid;
	private LocalDate start_date;
	private LocalDate end_date;
	private String description;
	private int leaves_applied;
	public int getLeave_id() {
		return leave_id;
	}
	public void setLeave_id(int leave_id) {
		this.leave_id = leave_id;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public LocalDate getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLeaves_applied() {
		return leaves_applied;
	}
	public void setLeaves_applied(int leaves_applied) {
		this.leaves_applied = leaves_applied;
	}
	
	
	
}
