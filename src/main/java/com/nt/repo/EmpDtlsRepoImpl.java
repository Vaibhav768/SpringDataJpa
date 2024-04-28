package com.nt.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDtlsRepoImpl {
	@Autowired
	private EmpDtlsRepository empRepo;
	
	public void createRecords() {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setEid(1005);
		emp1.setEname("Sagar");
		emp1.setEmail("sagar76@gmail.com");
		emp1.setAge(27);
		emp1.setDept("devops");
		emp1.setSalary(850000.00);
		
		Employee emp2 = new Employee();
		emp2.setEid(1004);
		emp2.setEname("Manoj");
		emp2.setEmail("manoj867@gmail.com");
		emp2.setAge(29);
		emp2.setDept("angular");
		emp2.setSalary(900000.00);
		
		list.add(emp1);
		list.add(emp2);
		empRepo.saveAll(List.of(emp1,emp2));
		System.out.println("Saved Successfully..");
	}
	
	public void deleteRecord(int eid) {
		empRepo.deleteById(eid);
		System.out.println("Record deleted successfully..");
	}
	
	public void getEmpInfoByEid(int eid) {
		Optional<Employee> empl = empRepo.findById(eid);
		Employee empdtls = empl.get();
		System.out.println(empdtls);
	}
	
	public void getAllEmpDtls() {
		List<Employee> emps = empRepo.findAll();
		emps.stream().forEach(System.out::println);
	}
	
	public void findEmpdtlsByEname(String ename) {
		List<Employee> empls = empRepo.findByEname(ename);
		empls.stream().forEach(System.out::println);
	}
	
	public void findByEmpege(Integer age) {
		List<Employee> empl = empRepo.findByAge(age);
		empl.stream().forEach(System.out::println);
	}
	
	public void findEmployeeByAgeSal(Integer age, Double salary) {
		List<Employee> employee = empRepo.findByAgeAndSalary(age, salary);
		employee.stream().forEach(System.out::println);
	}
	
}
