package com.LeaveApp.Service;

import java.util.List;

import com.LeaveApp.beans.EmployeeDetails;
import com.LeaveApp.beans.EmployeeLeaveDetails;

public interface ILeaveService {

	public EmployeeDetails findEmployee(int empId);
	public List<EmployeeLeaveDetails> getLeaveList(int empid);
}
