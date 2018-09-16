package com.springboot.data.repository;


import com.springboot.data.bean.Employee;
import com.springboot.data.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


}
