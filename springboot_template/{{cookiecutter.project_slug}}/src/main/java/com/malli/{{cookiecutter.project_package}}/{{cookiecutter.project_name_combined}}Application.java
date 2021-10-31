package com.malli.{{ cookiecutter.project_package }};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.project_name_combined}}Application {

	public static void main(String[] args) {
		SpringApplication.run({{cookiecutter.project_name_combined}}Application.class, args);
	}

}
