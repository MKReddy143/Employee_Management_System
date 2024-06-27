package com.java.SHProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.SHProject.Entity.Employee;
import com.java.SHProject.Entity.EmployeesList;
import com.java.SHProject.Service.EmployeeListService;
import com.java.SHProject.Service.EmployeeService;

import lombok.Data;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@Autowired
	private EmployeeListService listService;

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/Employee_register")
	public String bookRegister() {
		return "EmployeeRegister";
	}

	@GetMapping("/ListOfEmployees")
	public ModelAndView getAllBook() {
		List<Employee> list = service.getAllEmployee();
		return new ModelAndView("EmployeeList", "Employee", list);
	}

	@PostMapping("/save")
	public String addBook(@ModelAttribute Employee e) {
		service.save(e);
		return "redirect:/ListOfEmployees";
	}

	@RequestMapping("/editEmployee/{id}")
	public String editBook(@PathVariable("id") int id, Model model) {
		Employee b = service.getEmployeeId(id);
		model.addAttribute("Employee", b);
		return "EmployeeEdit";
	}

	@RequestMapping("/DeleteEmployee/{id}")
	public String deleteBook(@PathVariable("id") int id) {
		service.deleteById(id);
		return "redirect:/ListOfEmployees";
	}

}
