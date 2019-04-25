package com.test.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.ssm.mapper.StaffDAO;
import com.test.ssm.pojo.Staff;
import com.test.ssm.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService{
    @Autowired
    private StaffDAO staffDAO;



    @Override
    public PageInfo<Staff> getAllStaff(Staff staff,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<>(staffDAO.getAllStaff(staff));
    }
}
