package com.nt.repo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="employee_dtls")
public class Employee {
	@Id
	private int eid;
	private String ename;
	private String email;
	private int age;
	private String dept;
	private double salary;
}
