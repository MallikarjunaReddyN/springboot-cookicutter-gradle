package com.malli.{{ cookiecutter.project_package }}.repository;

import com.malli.{{ cookiecutter.project_package }}.domain.{{ cookiecutter.entity }};
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface {{ cookiecutter.entity }}Repository extends JpaRepository<{{ cookiecutter.entity }}, Integer> {
	
}
