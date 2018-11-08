package com.LeaveApp.dao;

import java.util.List;

import com.LeaveApp.beans.EmployeeDetails;
import com.LeaveApp.beans.EmployeeLeaveDetails;


public interface ILeaveDAO {

	public EmployeeDetails findEmployee(int empid);
	public List<EmployeeLeaveDetails> getLeaveList(int empid);
}
