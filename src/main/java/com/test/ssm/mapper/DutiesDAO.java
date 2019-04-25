package com.test.ssm.mapper;

import com.test.ssm.pojo.Department;
import com.test.ssm.pojo.Duties;

import java.util.List;

public interface DutiesDAO {
    List<Duties> getAllDuties();
    List<Department> getAllDeparment();
    void addDuties(Duties duties);
    List<Duties> getAll(int dptId);

}
