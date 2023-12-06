package com.nt.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Employee;
import com.nt.service.EmpService;

@RestController
public class HomeController {

	@Autowired
	private EmpService empservice;


	@GetMapping(value = "/employees/id/{i}")
	public Employee getById(@PathVariable("i") int id) {
		Employee e = empservice.findRecordById(id);
		return e;
	}

	@GetMapping("/employees/all")
	public List<Employee> getAllRecords() {
		return empservice.findAllRecords();
	}

	@PostMapping("/add")
	public String add(@RequestBody Employee e) {
		empservice.add(e);
		return "Added Successfully";
	}

	@PostMapping("/update")
	public String update(@RequestBody Employee e) {
		empservice.update(e);
		return "Update Successfully";
	}


	@GetMapping("/delete/id/{i}")
	public String getById1(@PathVariable("i") int id) {
		empservice.deleteById(id);
		
		return "Deleted Successfully";
	}
}
