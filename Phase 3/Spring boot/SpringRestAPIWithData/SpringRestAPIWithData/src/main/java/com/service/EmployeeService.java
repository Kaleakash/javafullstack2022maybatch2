package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}
	
	public String storeEmployee(Employee emp) {
		Optional<Employee> result = employeeRepository.findById(emp.getId());
		if(result.isPresent()) {
			return "Employee id must be unique";
		}else {
			employeeRepository.save(emp);
			return "Employee record stored successfully";
		}
	}
	
	public String updateEmployee(Employee emp) {
		Optional<Employee> result = employeeRepository.findById(emp.getId());
		if(result.isPresent()) {
			Employee e = result.get();
			e.setSalary(emp.getSalary());
			employeeRepository.saveAndFlush(e);
			return "Employee record updated successfully";
		}else {
			return "Employee record not present";
		}
	}
	
	public String deleteEmployee(int id) {
		Optional<Employee> result = employeeRepository.findById(id);
		if(result.isPresent()) {
			Employee e = result.get();
			employeeRepository.delete(e);
			return "Employee record deleted successfully";
		}else {
			return "Employee record not present";
		}
	}
}
