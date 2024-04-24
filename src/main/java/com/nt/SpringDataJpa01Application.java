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
	saved.createRecords();
	}

}
