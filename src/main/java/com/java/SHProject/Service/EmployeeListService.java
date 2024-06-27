package com.java.SHProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.SHProject.Entity.EmployeesList;
import com.java.SHProject.Repository.EmployeeListRepository;

@Service
public class EmployeeListService {

	@Autowired
	private EmployeeListRepository EmpList;

	public void SaveEmployee(EmployeesList book) {
		EmpList.save(book);
	}

	public List<EmployeesList> GetAllEmployees() {
		return EmpList.findAll();
	}

	public void deleteById(int id) {
		EmpList.deleteById(id);
	}
}