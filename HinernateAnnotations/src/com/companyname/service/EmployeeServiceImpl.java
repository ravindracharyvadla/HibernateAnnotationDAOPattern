package com.companyname.service;

import com.companyname.dao.EmployeeDAO;
import com.companyname.dao.EmployeeDAOImpl;
import com.companyname.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDAO employeeDAO=new EmployeeDAOImpl();
	
	@Override
	public void addEmployee(Employee e) {
		
		employeeDAO.addEmployee(e);
		
	}

	@Override
	public void showEmployee() {

		employeeDAO.showEmployee();
		
	}

	@Override
	public void editEmployee() {
		
		employeeDAO.editEmployee();
		
	}

	@Override
	public void deleteEmployee() {
		
		employeeDAO.deleteEmployee();
		
	}

}
