package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;

public class EmployeeDao {

	public int storeEmployee(Employee emp) {
			try {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");		// load the xml file which load the database details as well as entity class 
			//con.addClass(Employee.class);				// load the entity class 
			SessionFactory sf = con.buildSessionFactory();		// it is equal to Connection in JDBC 
			Session session = sf.openSession();					// it is equal to Statement or PreparedStatement 
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(emp);									// insert query 
			tran.commit();                                  // save record permantely.
			return 1;
			}catch(Exception e) {
				System.out.println(e);
				return 0;
			}
	}
	
	public int updateEmployee(Employee emp) {
			
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");		
		SessionFactory sf = con.buildSessionFactory();		
		Session session = sf.openSession();					
		Transaction tran = session.getTransaction();
		Employee e=session.get(Employee.class, emp.getId());
		if(e==null) {
				return 0;
		}else {
				tran.begin();
							e.setSalary(emp.getSalary());      // we replace the old salary by new salary 
							session.update(e);							// update query 
				tran.commit();
				return 1;
		}
	}

	
	public int deleteEmployee(int id) {
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");		
		SessionFactory sf = con.buildSessionFactory();		
		Session session = sf.openSession();					
		Transaction tran = session.getTransaction();
		Employee e=session.get(Employee.class, id);
		if(e==null) {
				return 0;
		}else {
				tran.begin();
							session.delete(e);								// delete query 
				tran.commit();
				return 1;
		}
	}
	
	public Employee findEmployeeById(int id) {
			Configuration con = new Configuration();
			con.configure("hibernate.cfg.xml");		
			SessionFactory sf = con.buildSessionFactory();		
			Session session = sf.openSession();					
			Employee e=session.get(Employee.class, id);
			return e;
		}

	
	public List<Employee> findAllEmployee() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");		
		SessionFactory sf = con.buildSessionFactory();		
		Session session = sf.openSession();					
		Query<Employee> qry	 = session.createQuery("select emp from Employee emp");     // HQL
		List<Employee> listOfEmp = qry.list();
		return listOfEmp;
	}
	
	public List<Employee> findAllEmployeeWithCondition(float salary) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");		
		SessionFactory sf = con.buildSessionFactory();		
		Session session = sf.openSession();
		// placeholder using ? 
		Query<Employee> qry	 = session.createQuery("select emp from Employee emp where emp.salary > ?1 ");     // HQL
		qry.setParameter(1, salary);
		
		// Label Query concept 
		//	Query<Employee> qry	 = session.createQuery("select emp from Employee emp where emp.salary > :abc ");     // HQL
		// qry.setParameter("abc", salary);
		
		List<Employee> listOfEmp = qry.list();
		return listOfEmp;
	}
}
