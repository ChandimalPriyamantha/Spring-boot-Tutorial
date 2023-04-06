package com.example.springbootbackend.repository;

import com.example.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*@Repository - Spring Data JPA internally provides @Repository Annotation so we no need to add
@Repository annotation to EmployeeRepository interface */

/* By default Spring Data JPA made jpaRepository methods transactional So we no need to add @Transactional annotation in
* Service class*/

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
