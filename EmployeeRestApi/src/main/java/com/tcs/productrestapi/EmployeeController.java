package com.tcs.productrestapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.employeerestapi.model.Employee;
import com.tcs.employeerestapi.service.EmployeeServices;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
@Autowired
	EmployeeServices employeeServices;
	
	
	@GetMapping
	public List<Employee> getEmployees() {
	
		return employeeServices.getEmployees().get();
		
		
	}


}

/**
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable("id") int Id) {
		return employeeServices.findById(Id).get();
	}}
	**/
/**
	@PostMapping("/create")
	public String addEmployee(@RequestBody Employee employee) {
	
	  return 	employeeServices.addEmployee(employee);
	}
	
}
	/**
	@DeleteMapping("/{id}")

	public String deleteProductById(@PathVariable int id) {
		
		productService.deleteProduct(id);
		return "success";
	}**/

