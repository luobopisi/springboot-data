package com.springboot.data.mapper;


import com.springboot.data.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//@Mapper或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper  {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
