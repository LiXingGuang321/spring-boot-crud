package spring.boot.web.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import spring.boot.web.dao.DepartmentDao;
import spring.boot.web.dao.EmployeeDao;
import spring.boot.web.entities.Department;
import spring.boot.web.entities.Employee;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao employeeDao;
	@Autowired
	DepartmentDao departmentDao;
	
	@GetMapping("/emps")
	public String list(Model model) {
		Collection<Employee> employees	= employeeDao.getAll();
		model.addAttribute("emps", employees);
		return "emp/list";
	}
	@GetMapping("/emp")
	public String toAddPage(Model model) {
		Collection<Department> departments = departmentDao.getDepartments();
		model.addAttribute("depts", departments);
		return "emp/add";
	}
	@PostMapping("/emp")
	public String addEmp(Employee employee) {
		System.out.println("保存的员工信息"+employee);
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	
	@GetMapping("/emp/{id}")
	public String toEditPage(@PathVariable("id") Integer id,Model model) {
		Employee employee =  employeeDao.get(id);
		model.addAttribute("emp", employee);
		Collection<Department> departments = departmentDao.getDepartments();
		model.addAttribute("depts", departments);
		return "emp/add";
	}
	@PutMapping("/emp")
	public String editEmp(Employee employee) {
		System.out.println(employee);
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	@DeleteMapping("/emp/{id}")
	public String deleteEmp(@PathVariable("id") Integer id) {
		
		employeeDao.delete(id);
		return "redirect:/emps";
	}
}
