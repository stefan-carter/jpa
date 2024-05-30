package com.carter.spring_data_jpa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;

    private Employee testEmployee;

    @BeforeEach
    public void setUp() {
        testEmployee = new Employee();
        testEmployee.setFirstName("Bruce");
        testEmployee.setLastName("Wayne");
        employeeRepository.save(testEmployee);
    }

    @AfterEach
    public void startOver() {
        employeeRepository.deleteAll();
    }

    @Test
    void employeeShouldHaveFirstName() {
        employeeRepository.findById(testEmployee.getId());
    }
}
