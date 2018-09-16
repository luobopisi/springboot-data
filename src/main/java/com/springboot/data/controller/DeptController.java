package com.springboot.data.controller;


import com.springboot.data.bean.Department;
import com.springboot.data.bean.Employee;
import com.springboot.data.bean.User;
import com.springboot.data.mapper.DepartmentMapper;
import com.springboot.data.mapper.EmployeeMapper;
import com.springboot.data.repository.EmployeeRepository;
import com.springboot.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    UserRepository userRepository;

    @Autowired
    EmployeeRepository repository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userRepository.findOne(id);
        return user;
    }

    @GetMapping("/user")
    public User insertUser(User user){
        User save = userRepository.save(user);
        return save;
    }


    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
       return employeeMapper.getEmpById(id);
    }

    @GetMapping("/empjpa/{id}")
    public Employee getEmpJpa(@PathVariable("id") Integer id){
        Employee employee = repository.findOne(id);
        return employee;
    }


}
