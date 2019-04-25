package com.test.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.ssm.mapper.DutiesDAO;
import com.test.ssm.pojo.Department;
import com.test.ssm.pojo.Duties;
import com.test.ssm.service.DutiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutiesServiceImpl implements DutiesService{
    @Autowired
    private DutiesDAO dutiesDAO;

    @Override
    public PageInfo<Duties> getAllDuties(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<>(dutiesDAO.getAllDuties());
    }

    @Override
    public List<Department> getAllDeparment() {
        return dutiesDAO.getAllDeparment();
    }

    @Override
    public void addDuties(Duties duties) {
        dutiesDAO.addDuties(duties);
    }

    @Override
    public List<Duties> getAll(int dptId) {
        return dutiesDAO.getAll(dptId);
    }
}
