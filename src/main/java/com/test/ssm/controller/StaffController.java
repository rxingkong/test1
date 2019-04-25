package com.test.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.test.ssm.mapper.StaffDAO;
import com.test.ssm.pojo.Department;
import com.test.ssm.pojo.Duties;
import com.test.ssm.pojo.Staff;
import com.test.ssm.service.DepartmentService;
import com.test.ssm.service.DutiesService;
import com.test.ssm.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class StaffController {
    @Autowired
    private StaffService staffService;
    @Autowired
    private DutiesService dutiesService;
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping("listStaff.html")
    @ResponseBody
    public ModelAndView listStaff(Staff staff, Integer pageNum,int dptId){
        ModelAndView modelAndView = new ModelAndView();     //将 Model 数据作为 request.attribute Foward 到下一个页面。
        if (pageNum==null||pageNum<1){
            pageNum=1;
        }

        PageInfo<Staff> pageInfo = staffService.getAllStaff(staff,pageNum,2);
        List<Department> departmentList=departmentService.getAll();
        List<Duties> dutiesList = dutiesService.getAll(dptId);
       modelAndView.addObject("staff",staff);
        modelAndView.addObject("departmentList",departmentList);
        modelAndView.addObject("pageInfo",pageInfo);
       modelAndView.addObject("dutiesList",dutiesList);
        modelAndView.setViewName("listStaff");
        return modelAndView;

//        return "listStaff";
    }

    @RequestMapping("list.html")
    //@ResponseBody
    public void ajax(int dptId, HttpServletResponse response){

        response.setContentType("application/json;charset=utf-8");
        System.out.println("ergwergdgsdfgsdgsdfgsdgsdgsdfgsdgsdfgsdgsd");
        List<Duties> dutiesList = dutiesService.getAll(dptId);
        System.out.println(dutiesList);
        String json  = JSON.toJSONString(dutiesList);
        try {
            response.getWriter().print(json);
        }catch (Exception e){}

      // return dutiesList;
    }

}
