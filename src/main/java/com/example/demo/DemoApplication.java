package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication 

{      
	@Autowired 
	JDBCRepo repo;

	@GetMapping(value="/get")
	public List<EmployeeBean> hello()
	{
		 return repo.getAll();
	}
	@GetMapping(value="/insert")
	public void insert()
	{
		repo.insert(new EmployeeBean(2, "Ramesh", "Fadatare","23" ,"ramesh@gmail.com"));
	}
	@GetMapping(value="/delete")
	public void delete()
	{
		repo.deleteById(2);
	}
	
	

	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
