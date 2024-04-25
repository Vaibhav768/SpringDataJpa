package com.nt.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDtlsRepoImpl {
	@Autowired
	private EmpDtlsRepository empRepo;
	
	public void createRecords() {
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setEid(1003);
		emp1.setEname("Rambhau");
		emp1.setEmail("ram546@gmail.com");
		emp1.setAge(24);
		emp1.setDept("amazon");
		emp1.setSalary(950000.00);
		
		Employee emp2 = new Employee();
		emp2.setEid(1002);
		emp2.setEname("Shubham");
		emp2.setEmail("shubham13@gmail.com");
		emp2.setAge(25);
		emp2.setDept("Pol");
		emp2.setSalary(800000.00);
		
		list.add(emp1);
		list.add(emp2);
		empRepo.saveAll(List.of(emp1,emp2));
		System.out.println("Saved Successfully..");
	}
	
	public void deleteRecord(int eid) {
		empRepo.deleteById(eid);
		System.out.println("Record deleted successfully..");
	}
}
