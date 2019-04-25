package com.test.ssm.service;

import com.github.pagehelper.PageInfo;
import com.test.ssm.pojo.Department;
import com.test.ssm.pojo.Duties;

import java.util.List;

public interface DutiesService {
   PageInfo<Duties> getAllDuties(Integer pageNum,Integer pageSize);
   List<Department> getAllDeparment();
   void addDuties(Duties duties);
   List<Duties> getAll(int dptId);
}
