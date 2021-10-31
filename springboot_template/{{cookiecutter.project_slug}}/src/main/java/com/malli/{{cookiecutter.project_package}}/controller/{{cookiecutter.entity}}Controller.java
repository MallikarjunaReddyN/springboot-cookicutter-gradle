package com.malli.{{ cookiecutter.project_package }}.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.malli.{{ cookiecutter.project_package }}.service.{{ cookiecutter.entity }}Service;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("{{ cookiecutter.entity.lower() }}")
public class {{ cookiecutter.entity }}Controller {
	
	@Autowired
    private {{ cookiecutter.entity }}Service {{ cookiecutter.entity.lower() }}Service;
		
	@GetMapping("/status")
    public String showStatus() {
        return "{{ cookiecutter.entity }} project is Running";
    }	
	
}
