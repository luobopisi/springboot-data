package com.springboot.data.bean;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;
    @Column(name = "lastname")
    private String lastName;
    @Column //省略默认列名就是属性名
    private Integer gender;
    @Column //省略默认列名就是属性名
    private String email;
    @Column(name = "d_id") //这是和数据表对应的一个列
    private Integer dId;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Integer getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public Integer getdId() {
        return dId;
    }
}
