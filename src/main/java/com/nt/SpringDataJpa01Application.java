package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.repo.EmpDtlsRepoImpl;

@SpringBootApplication
public class SpringDataJpa01Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpa01Application.class, args);
	EmpDtlsRepoImpl saved = ctx.getBean(EmpDtlsRepoImpl.class);
	//saved.createRecords();
	//saved.deleteRecord(1002);
	//saved.getEmpInfoByEid(1005);
	//saved.getAllEmpDtls();
	//saved.findEmpdtlsByEname("Sagar");
	//saved.findByEmpege(24);
	//saved.findEmployeeByAgeSal(24, 900000.0);
	//System.out.println("Hii..Vaibhav work hard..you are just 1 step away..");
	}

}
