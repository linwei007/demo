package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.persistence.ICityMapper;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);		
		ICityMapper cityMapper = run.getBean(ICityMapper.class);
		System.out.println(cityMapper.findByState("CA"));
		System.out.println(cityMapper.selectCityById(1));

	}
	
	

}

