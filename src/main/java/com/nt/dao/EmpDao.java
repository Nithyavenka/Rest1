package com.nt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Employee;

public interface EmpDao extends CrudRepository<Employee, Integer> {
@Override
List<Employee> findAll();

}
