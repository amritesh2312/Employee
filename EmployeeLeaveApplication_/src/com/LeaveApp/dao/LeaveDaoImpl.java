package com.LeaveApp.dao;

import java.beans.Statement;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.LeaveApp.beans.EmployeeDetails;
import com.LeaveApp.beans.EmployeeLeaveDetails;

public class LeaveDaoImpl implements ILeaveDAO {

	@PersistenceContext
	EntityManager manager;
	@Override
	public EmployeeDetails findEmployee(int empid) {
		
		
		return manager.find(EmployeeDetails.class, empid);

	}
	@Override
	public List<EmployeeLeaveDetails> getLeaveList(int empid) {
		// TODO Auto-generated method stub
		String str=
				"select student from EmployeeLeaveDetails student where student.empid=:cname";
				TypedQuery<EmployeeLeaveDetails> query= manager.createQuery(str, EmployeeLeaveDetails.class);
				query.setParameter("cname", empid);
				List<EmployeeLeaveDetails> list=query.getResultList();
				return list;
	}

}
