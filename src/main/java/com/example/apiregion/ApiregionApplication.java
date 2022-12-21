package com.example.apiregion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@ComponentScan({"com.mypackage.controller"})
public class ApiregionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiregionApplication.class, args);
	}

}
