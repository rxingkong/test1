package com.test.ssm.mapper;

import com.test.ssm.pojo.Department;

import java.util.List;

public interface DepartmentDAO {
    List<Department> getAllDeparment();
    void addDeparment(String dname);
    List<Department> getAll();
}
