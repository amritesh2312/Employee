package com.LeaveApp.Service;

import java.util.List;

import com.LeaveApp.beans.EmployeeDetails;
import com.LeaveApp.beans.EmployeeLeaveDetails;
import com.LeaveApp.dao.ILeaveDAO;

public class ILeaveServiceImpl implements ILeaveDAO {

	ILeaveDAO dao;
	@Override
	public EmployeeDetails findEmployee(int empid) {
		// TODO Auto-generated method stub
		return dao.findEmployee(empid);
	}
	@Override
	public List<EmployeeLeaveDetails> getLeaveList(int empid) {
		// TODO Auto-generated method stub
		return dao.getLeaveList(empid);
	}

}
