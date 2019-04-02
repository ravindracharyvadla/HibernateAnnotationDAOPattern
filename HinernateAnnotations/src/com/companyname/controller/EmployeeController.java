package com.companyname.controller;

import com.companyname.entity.Employee;
import com.companyname.service.EmployeeService;
import com.companyname.service.EmployeeServiceImpl;

public class EmployeeController {

	public static void main(String args[])
	{
		EmployeeService service=new EmployeeServiceImpl();
		//service.addEmployee(new Employee());
		service.showEmployee();
		
		
		/*service.editEmployee();
		System.out.println("----After Update---");
		service.showEmployee();*/
		
		service.deleteEmployee();
		System.out.println("---After Delete---");
		service.showEmployee();
	}
}
