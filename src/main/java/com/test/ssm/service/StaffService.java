package com.test.ssm.service;

import com.github.pagehelper.PageInfo;
import com.test.ssm.pojo.Staff;

public interface StaffService {
    PageInfo<Staff> getAllStaff(Staff staff,Integer pageNum,Integer pageSize);
}
