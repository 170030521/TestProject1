package com.vm.config;

import org.springframework.context.annotation.Bean;
import com.vm.entity.Employee;

public class MyAppConfig {

	
	@Bean(name="e1")
	public Employee getEmployee()
	{
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("geetha");
		return employee;
	}
}