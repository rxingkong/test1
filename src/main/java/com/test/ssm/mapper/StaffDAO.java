package com.test.ssm.mapper;

import com.test.ssm.pojo.Staff;

import java.util.List;

public interface StaffDAO {
    List<Staff> getAllStaff(Staff staff);
}
