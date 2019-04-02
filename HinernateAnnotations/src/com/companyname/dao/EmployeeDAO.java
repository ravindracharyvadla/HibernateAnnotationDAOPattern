package com.companyname.dao;

import com.companyname.entity.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee e);
	public void showEmployee();
	public void editEmployee();
	public void deleteEmployee();
}
