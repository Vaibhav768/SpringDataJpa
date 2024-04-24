package com.nt.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDtlsRepoImpl {
	@Autowired
	private EmpDtlsRepository empRepo;
	
	public void createRecords() {
		Employee emp1 = new Employee();
		emp1.setEid(1001);
		emp1.setEname("Vaibhav");
		emp1.setEmail("vbagal43@gmail.com");
		emp1.setAge(24);
		emp1.setDept("Dev");
		emp1.setSalary(900000.00);
		
		empRepo.save(emp1);
		System.out.println("Saved Successfully..");
	}
}
