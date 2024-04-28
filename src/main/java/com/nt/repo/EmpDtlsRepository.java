package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpDtlsRepository extends JpaRepository<Employee,Integer>{
	public List<Employee> findByEname(String ename);
	public List<Employee> findByAge(Integer age);
	public List<Employee> findByAgeAndSalary(Integer age, Double salary);
}
