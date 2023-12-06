package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.EmpDao;
import com.nt.entity.Employee;

@Service
public class EmpService {

	@Autowired
	private EmpDao dao;

	public Employee findRecordById(int id) {
		Optional<Employee> opt = dao.findById(id);
		return opt.get();

	}

	public List<Employee> findAllRecords() {
		List<Employee> itr = dao.findAll();
		return itr;
	}

	public void add(Employee e) {
		dao.save(e);

	}

	public void update(Employee e) {
		dao.save(e);

	}

	public void deleteById(int id) {
		dao.deleteById(id);

	}

}
