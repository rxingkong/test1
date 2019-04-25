package com.test.ssm.service;

import com.github.pagehelper.PageInfo;
import com.test.ssm.pojo.Department;

import java.util.List;

public interface DepartmentService {
    PageInfo<Department> getAllDeparment(Integer pageNum,Integer pageSize);
    void addDeparment(String dname);
    List<Department> getAll();
}
