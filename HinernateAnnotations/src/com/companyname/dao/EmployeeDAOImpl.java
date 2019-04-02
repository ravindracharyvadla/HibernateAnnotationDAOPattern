package com.companyname.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.companyname.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	SessionFactory sessionFactory;
	Session session;
	Transaction transaction;
	
	@Override
	public void addEmployee(Employee e) {
		
		sessionFactory=new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		
		
		
		//e.setEmployeeId(1122);
		e.setEmployeeName("Gavin King");
		e.setEmailId("gavin@gmail.com");
		e.setContactNumber("9876543210");
		
		session.save(e);
		
		transaction.commit();
		System.out.println("Data has been successfully inserted.");
		session.close();
	}

	@Override
	public void showEmployee() {
		
		sessionFactory=new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		
		String selectQuery="from Employee";//Employee is Entity class name
		Query query=session.createQuery(selectQuery);
		List<Employee> list=query.list();
		for(Employee e:list){
			System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getEmailId()+"\t"+e.getContactNumber());
		}
		
		transaction.commit();
		session.close();
	}

	@Override
	public void editEmployee() {
		
		sessionFactory=new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		
		String updateQuery="update Employee e set e.employeeName='gosling' where e.employeeId=7";
		Query query = session.createQuery(updateQuery);

	    //query.setParameter(0,"James');
		//query.setParameter(1, 7);

		int result = query.executeUpdate();
		
		transaction.commit();
		session.close();
		
	}

	@Override
	public void deleteEmployee() {
		
		sessionFactory=new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		
		String deleteQuery="delete from Employee e where e.employeeId=8";
		Query query = session.createQuery(deleteQuery);
		//query.setParameter(0,8);

		int result = query.executeUpdate();
		
		transaction.commit();
		session.close();
		
	}

}
