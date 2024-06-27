package com.java.SHProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.SHProject.Entity.Employee;
import com.java.SHProject.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository eRepo;

	public void save(Employee b) {
		eRepo.save(b);
	}

	public List<Employee> getAllEmployee() {
		return eRepo.findAll();
	}

	public Employee getEmployeeId(int id) {
		return eRepo.findById(id).get();
	}

	public void deleteById(int id) {
		eRepo.deleteById(id);
	}
}