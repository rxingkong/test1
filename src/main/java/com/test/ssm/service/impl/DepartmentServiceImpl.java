package com.test.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.ssm.mapper.DepartmentDAO;
import com.test.ssm.pojo.Department;
import com.test.ssm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    private DepartmentDAO departmentDAO;

    @Override
    public PageInfo<Department> getAllDeparment(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<>(departmentDAO.getAllDeparment());
    }

    @Override
    public void addDeparment(String dname) {
        departmentDAO.addDeparment(dname);
    }

    @Override
    public List<Department> getAll() {
        return departmentDAO.getAll();
    }
}
