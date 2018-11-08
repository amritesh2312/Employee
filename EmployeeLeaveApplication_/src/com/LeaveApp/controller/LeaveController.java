package com.LeaveApp.controller;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.LeaveApp.Service.ILeaveService;
import com.LeaveApp.beans.EmployeeDetails;
import com.LeaveApp.beans.EmployeeLeaveDetails;

@Controller
public class LeaveController {

	ILeaveService service = null;
	EmployeeDetails ed=null;
	@RequestMapping("ViewDetails.obj")
	public String viewEmployee(Model model, @RequestParam("EmpId") String EmpId)
	{
		
		int a = Integer.parseInt(EmpId);
		
		ed = service.findEmployee(a);
		
		if(ed==null)
		{
			return "Error";
		}
		
		List<EmployeeLeaveDetails> list=service.getLeaveList(a);
		if(list.isEmpty())
		{
			model.addAttribute("Employee",ed);
			model.addAttribute("msg","No Leave Record Found");
			return "ViewLeaveDetails";
		}
		model.addAttribute("LeaveList",list);
		model.addAttribute("Employee",ed);
		return "ViewLeaveDetails";
	}
	
	
}
