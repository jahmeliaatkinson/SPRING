package com.tcs.productrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages= {"com.tcs.employeerestapi.controller"})
public class EmployeeRestApiApplication {
public static void main(String[] args) throws Exception {
	SpringApplication.run(EmployeeRestApiApplication.class, args);
	
	
}

}
